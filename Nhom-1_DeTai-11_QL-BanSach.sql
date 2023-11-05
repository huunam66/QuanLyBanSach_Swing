create database CuaHangSach;
go

use CuaHangSach
go

create table SACH(
	MaSach			varchar(20) not null,
	TenSach			nvarchar(150) not null unique,
	Price			decimal(15, 3) not null,
	SoLuong			int default(50) not null,
	TacGia			nvarchar(50) not null,
	NgayXuatBan		date not null,
	NhaXuatBan		nvarchar(50) not null,
	MA_TL			varchar(10) not null
)
go

alter table SACH add constraint PRK_SACH primary key(MaSach)
go


create table THELOAI(
	MA_TL			varchar(10) not null,
	TL_Sach			nvarchar(50) not null
)
go

alter table THELOAI add constraint PRK_THELOAI primary key(MA_TL)
go

create table NHANVIEN(
	MaNV			varchar(20) not null,
	TenNhanVien		nvarchar(50) not null,
	NgaySinh		date not null,
	GioiTinh		nvarchar(4) not null,
	Email			varchar(50) not null,
	SDT				varchar(11) not null,
	CMND			varchar(12) not null,
	DIACHI			nvarchar(50) not null,
	ChucVu			nvarchar(50) not null
)
go

alter table NHANVIEN add constraint PRK_NHANVIEN primary key(MaNV)
go


create table TAIKHOAN(
	MaNV			varchar(20) not null,
	Username		varchar(50) not null unique,
	Password		varchar(50) not null,
	Quyen			varchar(10) not null
)
go

alter table TAIKHOAN add constraint PRK_TAIKHOAN primary key(MaNV)
go

create table KHACHHANG(
	MaKH			varchar(20) not null,
	TenKhach		nvarchar(50) not null,
	SDT				varchar(50) not null,
	GioiTinh		nvarchar(4) not null,
	DiaChi			nvarchar(50) not null
)
go

alter table KHACHHANG add constraint PRK_table_KHACHHANG primary key(MaKH)
go

create table HOADON(
	MaHoaDon		bigint identity not null,
	MaKH			varchar(20) not null,
	MaNV			varchar(20) not null,
	NgayThanhToan	date not null,
	SoLuongSach		int,
	ThanhTien		decimal(18, 3)
)
go


alter table HOADON add constraint PRK_HOADON primary key(MaHoaDon)
go

create table CT_HOADON(
	MaHoaDon		bigint not null,
	MaSach			varchar(20) not null,
	SoLuong			int not null,
	GiamGia			varchar(10) not null,
	TongTien		decimal(15, 3) not null
)
go

alter table CT_HOADON add constraint PRK_CT_HOADON primary key(MaHoaDon, MaSach)
go

alter table CT_HOADON add constraint FRK_CT_HOADON_MaHoaDon foreign key(MaHoaDon) references HOADON(MaHoaDon) on delete cascade
alter table CT_HOADON add constraint FRK_CT_HOADON_MaSach foreign key(MaSach) references Sach(MaSach) on delete cascade
go

alter table HOADON add constraint FRK_HOADON_MaKH foreign key(MaKH) references KHACHHANG(MaKH) on delete cascade
alter table HOADON add constraint FRK_HOADON_MaNV foreign key(MaNV) references NHANVIEN(MaNV) on delete cascade
go

alter table TAIKHOAN add constraint FRK_TAIKHOAN_MaNV foreign key(MaNV) references NHANVIEN(MaNV) on delete cascade
go

alter table SACH add constraint FK_SACH_MA_TL foreign key(MA_TL) references THELOAI(MA_TL) on delete cascade
go

insert into NHANVIEN(MaNV, TenNhanVien, NgaySinh, GioiTinh, Email, SDT, CMND, DIACHI, ChucVu)
values
('NV001', N'Nguyễn Văn A', '2000-01-01', N'Nam', 'nguyenvana@gmail.com', '0987654321', '001122334455', N'Hà Nội', N'Quản lý')
go

insert into TAIKHOAN(MaNV, Username, Password, Quyen)
values
('NV001', 'admin', '123456', 'admin')
go

insert into NHANVIEN(MaNV, TenNhanVien, NgaySinh, GioiTinh, Email, SDT, CMND, DIACHI, ChucVu)
values
('NV0012', N'Nguyễn Văn A', '2000-01-01', N'Nam', 'nguyenvana@gmail.com', '0987654321', '001122334455', N'Hà Nội', N'Quản lý')
go

insert into TAIKHOAN(MaNV, Username, Password, Quyen)
values
('NV0012', 'ad', '123456', 'user')
go

insert into THELOAI(MA_TL, TL_Sach)
values 
('TL001', N'Tiểu thuyết'),
('TL002', N'Kinh tế'),
('TL003', N'Văn học'),
('TL004', N'Khoa học'),
('TL005', N'Lịch sử')
go

insert into SACH(MaSach, TenSach, Price, SoLuong, TacGia, NgayXuatBan, NhaXuatBan, MA_TL)
values 
('S001', N'Đắc nhân tâm', 200000, 100, N'Dale Carnegie', '2020-01-01', N'NXB Trẻ', 'TL001'),
('S002', N'Tôi tài giỏi - bạn cũng thế', 150000, 50, N'Adam Khoo', '2019-12-15', N'Nhã Nam', 'TL002'),
('S003', N'Bảy người kỳ quái', 130000, 30, N'Dương Thu Hương', '2021-03-21', N'NXB Văn học', 'TL003'),
('S004', N'The Science Book', 250000, 20, N'Peter Tallack', '2018-09-30', N'DK Publishing', 'TL004'),
('S005', N'Việt Nam ơi, mua dây!', 120000, 70, N'Phùng Quán', '2017-07-10', N'NXB Văn học', 'TL003'),
('S006', N'Tiến bộ ở đâu?', 90000, 40, N'Đặng Hoàng Giang', '2022-02-22', N'NXB Tổng hợp TPHCM', 'TL004'),
('S007', N'Nhà Giả Kim', 180000, 50, N'Paulo Coelho', '2015-05-05', N'NXB Văn học', 'TL003'),
('S008', N'Đọc vị bất kỳ ai', 130000, 60, N'Vân Trang Phùng', '2021-12-31', N'NXB HCM', 'TL002'),
('S009', N'Thông điệp tự tin và sự nghiệp', 210000, 40, N'Nghiêm Xuân Yêm', '2020-06-30', N'Thái Hà Books', 'TL001'),
('S010', N'Cuộc đời của Pi', 160000, 30, N'Yann Martel', '2016-01-01', N'NXB Văn học', 'TL003'),
('S011', N'Chính trị và đời sống', 130000, 20, N'Võ Trọng Phụng', '2019-11-11', N'NXB TP HCM', 'TL003'),
('S012', N'Quản lý dự án ứng dụng Agile', 180000, 80, N'Đinh Phong Thịnh', '2022-01-01', N'NXB Tổng hợp TPHCM', 'TL002'),
('S013', N'Triết học hạnh phúc', 190000, 25, N'Bertrand Russell', '2018-08-02', N'NXB Triết học', 'TL004'),
('S014', N'Anh hùng xa lộ', 220000, 15, N'David Foster Wallace', '2017-04-01', N'Trẻ', 'TL003'),
('S015', N'Trạng nguyên', 150000, 35, N'Vũ Trọng Phụng', '2020-07-15', N'NXB TP HCM', 'TL003'),
('S016', N'Tư duy phản biện', 190000, 40, N'Lê Thẩm Dương', '2019-05-20', N'Hội Nhà văn', 'TL004'),
('S017', N'Kẻ đánh cắp giấc mơ', 170000, 22, N'Haruki Murakami', '2021-02-14', N'NXB Trẻ', 'TL003'),
('S018', N'Chủ nghĩa xã hội khoa học', 200000, 55, N'Karl Marx, Friedrich Engels', '2016-07-07', N'Trẻ', 'TL004'),
('S019', N'Khác biệt để thành công', 120000, 45, N'Steve Jobs', '2015-12-25', N'Thiên Long Books', 'TL002'),
('S020', N'Tiếng Chim Hót Trong Bụi Mận Gai', 180000, 50, N'Colleen McCullough', '2017-10-10', N'NXB Văn học', 'TL003'),
('S021', N'Giết con chim nhại', 190000, 30, N'Harper Lee', '2016-06-30', N'NXB Văn học', 'TL003'),
('S022', N'Chu du biên giới', 150000, 75, N'Nguyen Qui Duc', '2021-04-09', N'Riêng', 'TL005'),
('S023', N'Lượng giác', 130000, 62, N'Nguyễn Minh Hoàng', '2020-09-12', N'NXB Tổng hợp TP HCM', 'TL004'),
('S024', N'Tâm lí học đám đông', 170000, 55, N'Gustave Le Bon', '2019-08-08', N'Nhã Nam', 'TL002'),
('S025', N'Hành trình về phương Đông', 200000, 40, N'Hermann Hesse', '2018-03-20', N'NXB Văn học', 'TL003'),
('S026', N'Cốt cách vĩ đại', 250000, 20, N'Angela Duckworth', '2015-02-28', N'NXB Trẻ', 'TL001'),
('S027', N'Đi tìm lẽ sống', 190000, 30, N'Viktor E. Frankl', '2022-03-18', N'Trẻ', 'TL003'),
('S028', N'Tim giảm cân', 120000, 80, N'Mike Moreno', '2017-11-19', N'Nhã Nam', 'TL002'),
('S029', N'Những người khốn khổ', 180000, 40, N'Victor Hugo', '2016-12-01', N'NXB Văn học', 'TL003'),
('S030', N'Tưởng niệm các vị lãnh tụ tại đài tưởng niệm Bắc Kinh', 160000, 25, N'Lý Bằng', '2018-01-01', N'NXB Trẻ', 'TL005'),
('S031', N'Lập trình Shell script', 220000, 20, N'Steven Parker', '2019-06-13', N'NXB Thống kê', 'TL004'),
('S032', N'Sức mạnh của tư duy', 170000, 45, N'Edward de Bono', '2020-05-17', N'NXB Triết học', 'TL004'),
('S033', N'Tôi tài giỏi - bạn cũng vậy', 150000, 50, N'Adam Khoo', '2013-10-27', N'Nhã Nam', 'TL002'),
('S034', N'Phong thần diễn nghĩa', 120000, 60, N'Nguyễn Duy Cần', '2022-01-23', N'Trẻ', 'TL003'),
('S035', N'Sức mạnh của ngôn từ', 190000, 30, N'Tony Robbins', '2021-11-11', N'Kinh Tế', 'TL002'),
('S036', N'Tản văn', 160000, 25, N'Nguyễn Tuân', '2014-09-05', N'NXB TP HCM', 'TL003'),
('S037', N'Đọc vị đối tác', 170000, 27, N'Theo quan điểm của Trump', '2019-04-01', N'NXB Thế giới', 'TL002'),
('S038', N'Đất rừng phương Nam', 200000, 20, N'Dương Thu Hương', '2017-06-08', N'NXB Văn học', 'TL003'),
('S039', N'Nắm giữ Trái tim em', 220000, 18, N'Anna Cleeves', '2022-02-27', N'Nhà Xuất bản Lao động', 'TL003'),
('S040', N'Chuyện kể cho con nghe', 180000, 22, N'Santiago Posteguillo', '2022-05-25', N'NXB Trẻ', 'TL005'),
('S041', N'Quẳng gánh lo đi và vui sống', 160000, 40, N'Dale Carnegie', '2021-09-01', N'Thái Hà Books', 'TL001'),
('S042', N'Tiếng Việt 1', 25000, 100, N'Bộ giáo dục Đào tạo', '2019-11-11', N'Giáo dục Việt Nam', 'TL004'),
('S043', N'Dorothea', 220000, 18, N'Leo Tolstoy', '2020-02-29', N'Trẻ', 'TL003'),
('S044', N'Lập trình Arduino', 180000, 25, N'Park Kye Sang', '2016-03-30', N'Học viện kỹ thuật quân sự', 'TL004'),
('S045', N'Chạy trốn', 190000, 20, N'Harlan Coben', '2015-01-12', N'NXB Văn học', 'TL003'),
('S046', N'Sách tiếng Anh', 120000, 50, N'Kenney Norton', '2017-09-03', N'Pearson Education', 'TL004'),
('S047', N'Không gian mê cung', 170000, 32, N'James Dashner', '2014-07-03', N'Trẻ', 'TL003'),
('S048', N'Phía sau những tấm biển', 200000, 22, N'Nguyễn Ngọc Tư', '2022-04-10', N'NXB Trẻ', 'TL003'),
('S049', N'Âm mưu và tình yêu', 150000, 38, N'Daniel Steel', '2018-12-27', N'NXB Văn học', 'TL003'),
('S050', N'Mắt biếc', 190000, 35, N'Nguyễn Nhật Ánh', '2016-09-21', N'NXB Trẻ', 'TL003')
go


create function checkExistNhanVien(@email varchar(50), @sdt varchar(11), @cmnd varchar(12))
returns int
as begin
	return (select count(*) from NHANVIEN where Email = @email or SDT = @sdt or CMND = @cmnd)
end
go


create proc updateNhanVien @maNV varchar(20), @tenNV nvarchar(50), @ngaySinh date, @gioiTinh nvarchar(4), @email varchar(50), @sdt varchar(11), @cmnd varchar(12), @diachi nvarchar(50), @chucvu nvarchar(50)
as begin
	update NHANVIEN set TenNhanVien = @tenNV, NgaySinh = @ngaySinh, GioiTinh = @gioiTinh, Email = @email, SDT = @sdt, CMND = @cmnd, DIACHI = @diachi, ChucVu = @chucvu where MaNV = @maNV
end
go



create function checkUpdateNhanVien(@maNV varchar(20), @email varchar(50), @sdt varchar(11), @cmnd varchar(12))
returns int
as begin
	return (select count(*) from NHANVIEN where MaNV != @maNV and Email = @email or MaNV != @maNV and SDT = @sdt or MaNV != @maNV  and CMND = @cmnd)
end
go



create function getListTaiKhoan()
returns @ds table(taikhoan varchar(50), matkhau varchar(50), quyen nvarchar(20), maNV varchar(20), hoTen nvarchar(50), cmnd varchar(12))
as begin
	insert into @ds 
			select Username, Password, Quyen, NV.MaNV, TenNhanVien, CMND 
			from TAIKHOAN TK join NHANVIEN NV 
			on TK.MaNV = NV.MaNV
	return
end
go


create function NhanVienChuaCoTaiKhoan()
returns @ds Table(maNV varchar(10), tenNV nvarchar(50), cmnd varchar(12))
as begin
	declare cursor_NhanVien cursor for select MaNV, TenNhanVien, CMND from NHANVIEN;
	declare @maNV varchar(20), @tenNV nvarchar(50), @cmnd varchar(12);
	open cursor_NhanVien;
	fetch next from cursor_NhanVien into @maNV, @tenNV, @cmnd;
	while(@@FETCH_STATUS = 0)
	begin
		if not exists (select * from TAIKHOAN where TAIKHOAN.MaNV = @maNV)
		begin
			insert into @ds values (@maNV, @tenNV, @cmnd);
		end
		fetch next from cursor_NhanVien into @maNV, @tenNV, @cmnd;
	end
	close cursor_NhanVien;
	deallocate cursor_NhanVien;
	return;
end
go

create proc UpdateSach @maSach varchar(20), @tenSach nvarchar(50), @gia decimal(9, 3), @soLuong int, @tacGia nvarchar(50), @ngayXuatBan date, @nhaXuatBan nvarchar(50), @maTL varchar(10)
as begin
	update SACH set TenSach = @tenSach, Price = @gia, SoLuong = @soLuong, NgayXuatBan = @ngayXuatBan, NhaXuatBan = @nhaXuatBan, MA_TL = @maTL where MaSach = @maSach;
end
go

create trigger capNhatSL_Sach
on CT_HOADON
after insert, delete, update
as begin
	declare @maSA varchar(20) = (select inserted.MaSach from inserted);
	declare @soLuong int = (select inserted.SoLuong from inserted);
	if @maSA is not null
	begin
		update SACH set SoLuong = SoLuong - @soLuong;
	end;

	select @maSA = (select deleted.MaSach from deleted);
	select @soLuong = (select deleted.SoLuong from deleted);
	if @maSA is not null
	begin
		update SACH set SoLuong = SoLuong + @soLuong;
	end;
end;
go

--select top(1) * from NHANVIEN order by MaNV

create trigger capNhatSlnTtHoadon on CT_HOADON after insert, delete, update
as begin
	if exists (select * from inserted)
	begin
		declare @sl int = (select SoLuong from inserted);
		declare @maDH varchar(20) = (select MaHoaDon from inserted);
		declare @thanhTien decimal(10, 3) = (select TongTien from inserted);
		
		update HOADON set SoLuongSach += @sl where MaHoaDon = @maDH;
		update HOADON set ThanhTien += @thanhTien where MaHoaDon = @maDH;
	end
end
go

create function timKhachQuen(@maKH varchar(20))
returns int
as begin 
	return (select count(*) from KHACHHANG where MaKH = @maKH);
end
go

