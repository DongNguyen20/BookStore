create database QLNS
use QLNS
go

CREATE TABLE NGUOIDUNG
(
	TenDangNhap VARCHAR(100) NOT NULL DEFAULT '' PRIMARY KEY,
	TenHienThi NVARCHAR(100),
	MatKhau VARCHAR(100) NOT NULL DEFAULT '',
    LoaiTaiKhoan int  /* 0:staff, 1:admin */
);
select*from NGUOIDUNG
insert into NGUOIDUNG values('admin','DongNguyen','123',1)
insert into NGUOIDUNG values('ad','AAA','123',2)

update NGUOIDUNG set MatKhau='111' where TenDangNhap= 'ad'

CREATE TABLE SACH
(
	MaSach nvarchar(10)  PRIMARY KEY,
    TenSach NVARCHAR(100),
    MaTheLoai int not null,
	NhaXuatBan NVARCHAR(100) NOT NULL,
	NamXuatBan INT NOT NULL,
	SoLuongTon INT NOT NULL DEFAULT 0,
	DonGiaNhap int NOT NULL DEFAULT 0
);

CREATE TABLE THELOAISACH
(
	MaTheLoai INT identity PRIMARY KEY,
	TenTheLoai NVARCHAR(100) NOT NULL
);

/* tạo khóa ngoại */
alter table SACH 
add constraint SACH_THELOAISACH_FK 
foreign key(MaTheLoai) references THELOAISACH(MaTheLoai);

select *from SACH 
select *from CT_TACGIA 
select *from THELOAISACH
select  MaSach, TenSach, TenTheLoai, NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap
from SACH,  THELOAISACH where SACH.MaTheLoai = THELOAISACH.MaTheLoai

CREATE TABLE TACGIA
(
	MaTacGia INT identity PRIMARY KEY,
	TenTacGia NVARCHAR(100) NOT NULL
);

CREATE TABLE CT_TACGIA
(
	MaSach nvarchar(10) ,
	MaTacGia INT NOT NULL ,
	CONSTRAINT PK_CTTACGIA PRIMARY KEY (MaSach,MaTacGia)
);

alter table SACH 
add constraint SACH_THELOAISACH_FK 
foreign key(MaTheLoai) references THELOAISACH(MaTheLoai);

alter table CT_TACGIA 
add constraint CT_TACGIA_SACH_FK 
foreign key(MaSach) references SACH(MaSach);

alter table CT_TACGIA 
add constraint CT_TACGIA_TACGIA_FK 
foreign key(MaTacGia) references TACGIA(MaTacGia);

select SACH.MaSach, TenSach, TenTacGia, TenTheLoai, NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap
from SACH,  THELOAISACH, TACGIA, CT_TACGIA
where SACH.MaTheLoai = THELOAISACH.MaTheLoai and 
CT_TACGIA.MaSach = SACH.MaSach and 
CT_TACGIA.MaTacGia = TACGIA.MaTacGia; 

insert into CT_TACGIA 
insert into SACH (MaSach, TenSach, NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap) values ('GT03', N'Giáo trình C#', 'UIT', 2016, 22, 15000) 
select TenTacGia
from TACGIA, CT_TACGIA where CT_TACGIA.MaTacGia = TACGIA.MaTacGia;
select *from TACGIA
select *from SACH
select *from THELOAISACH
select *from CT_TACGIA

select SACH.MaSach, TenSach, TenTheLoai,NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap
from SACH, TACGIA, CT_TACGIA, THELOAISACH
where SACH.MaSach = CT_TACGIA.MaSach and
CT_TACGIA.MaTacGia = TACGIA.MaTacGia and 
SACH.MaTheLoai = THELOAISACH.MaTheLoai
and TenTacGia = 'Jame'

select MaTacGia from TACGIA 
delete from SACH where MaSach ='KH01'
delete  from TACGIA where MaTacGia = 11

insert into THELOAISACH (TenTheLoai) values ('Truyện Ngụ Ngôn') 
delete from THELOAISACH where TenTheLoai = 'Truyện Ngụ Ngôn'
delete from THELOAISACH where MaTheLoai = 8 

CREATE TABLE PHIEUNHAPSACH
(
	SoPhieuNhap INT identity PRIMARY KEY,
	NgayLap DATE NOT NULL DEFAULT GETDATE(),
	TongTien FLOAT DEFAULT 0
);

CREATE TABLE CT_PHIEUNHAPSACH
(
	SoPhieuNhap INT NOT NULL ,
	MaSach nvarchar(10) NOT NULL ,
	SoLuongNhap INT NOT NULL DEFAULT 0,
	DonGiaNhap FLOAT NOT NULL DEFAULT 0,
	ThanhTien FLOAT NOT NULL DEFAULT 0,	
	CONSTRAINT PK_CTPHIEUNHAPSACH PRIMARY KEY (SoPhieuNhap,MaSach)
);

alter table CT_PHIEUNHAPSACH 
add constraint CT_PHIEUNHAPSACH_PHIEUNHAPSACH_FK 
foreign key(SoPhieuNhap) references PHIEUNHAPSACH(SoPhieuNhap);

alter table CT_PHIEUNHAPSACH 
add constraint CT_PHIEUNHAPSACH_SACH_FK 
foreign key(MaSach) references SACH(MaSach);

CREATE TABLE KHACHHANG
(
	MaKhachHang INT identity PRIMARY KEY,
	TenKhachHang NVARCHAR(100) NOT NULL DEFAULT ' ',
	DiaChi NVARCHAR(200)NOT NULL DEFAULT ' ',
	SoDienThoai VARCHAR(11)NOT NULL DEFAULT ' ',
	Email VARCHAR(100)NOT NULL DEFAULT ' ',
	SoTienNo FLOAT NOT NULL DEFAULT 0
);

CREATE TABLE HOADON
(
	SoHoaDon INT identity PRIMARY KEY,
	MaKhachHang INT NOT NULL ,
	NgayLap DATE NOT NULL DEFAULT GETDATE(),
	TongTien FLOAT NOT NULL DEFAULT 0,
	ThanhToan float NOT NULL DEFAULT 0,
	ConLai FLOAT NOT NULL DEFAULT 0
);

alter table HOADON 
add constraint HOADON_KHACHHANG_FK 
foreign key(MaKhachHang) references KHACHHANG(MaKhachHang);

select *from KHACHHANG
insert into KHACHHANG (TenKhachHang, DiaChi, SoDienThoai, Email, SoTienNo) 
values (N'Văn B', N'Hà Nội', '0982468425', 'b22@gmail.com', 1247000)

CREATE TABLE CT_HOADON
(
	SoHoaDon INT NOT NULL ,
	MaSach nvarchar(10) NOT NULL ,
	SoLuong INT NOT NULL DEFAULT 0,
	DonGiaBan FLOAT NOT NULL DEFAULT 0,
	ThanhTien FLOAT DEFAULT 0,
	CONSTRAINT PK_CTHD PRIMARY KEY(SoHoaDon,MaSach)
);

alter table CT_HOADON 
add constraint CT_HOADON_HOADON_FK 
foreign key(SoHoaDon) references HOADON(SoHoaDon);

alter table CT_HOADON 
add constraint CT_HOADON_SACH_FK 
foreign key(MaSach) references SACH(MaSach);


select *from HOADON
select *from CT_HOADON
CREATE TABLE BAOCAOTON
(
	Thang INT NOT NULL ,
	Nam INT NOT NULL  ,
	MaSach nvarchar(10) NOT NULL ,
	TonDau INT NOT NULL DEFAULT 0,
	PhatSinh INT NOT NULL DEFAULT 0,
	TonCuoi INT NOT NULL DEFAULT 0,
	CONSTRAINT PK_ReportCountInfo PRIMARY KEY( Thang,Nam,MaSach)
);

alter table BAOCAOTON 
add constraint BAOCAOTON_SACH_FK 
foreign key(MaSach) references SACH(MaSach);

CREATE TABLE BAOCAODOANHTHU
(
	Thang INT NOT NULL ,
	Nam INT NOT NULL  ,
    MaSach nvarchar(10) NOT NULL,
    SoLuongBan	INT,
    TongTien FLOAT,
    CONSTRAINT PK_ReportSale PRIMARY KEY(Thang, Nam, MaSach)
);

alter table BAOCAODOANHTHU 
add constraint BAOCAODOANHTHU_SACH_FK 
foreign key(MaSach) references SACH(MaSach);





select  MaSach, TenSach, TenTheLoai, NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap
from SACH,  THELOAISACH where SACH.MaTheLoai = THELOAISACH.MaTheLoai

insert into SACH (TenSach, MaTheLoai,NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap) 
values(N'Trạng Tý', 1, N'Kim Đồng', 2015, 36, 7000)

insert into SACH (TenSach, MaTheLoai,NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap) 
values(N'Trạng Quỳnh', 1, N'Kim Đồng', 2012, 24, 7500)

select *from KHACHHANG where TenKhachHang = N'Văn C'
select TenKhachHang from KHACHHANG where MaKhachHang=1
select TenKhachHang from KHACHHANG where MaKhachHang=2

select *from SACH
update SACH  set SoLuongTon= 26 where MaSach= 'TC01'
select *from HOADON
select *from CT_HOADON

declare @nam int
set @nam = 2018

select SACH.MaSach, TenSach, SACH.DonGiaNhap, SoLuongTon, NgayNhap
from SACH where
Year(NgayNhap) <= 2018 and MONTH(NgayNhap) <= 5


select CT_HOADON.MaSach, TenSach, SoLuong, DonGiaBan, ThanhTien, NgayLap
from SACH, CT_HOADON, HOADON
where CT_HOADON.MaSach= SACH.MaSach and CT_HOADON.SoHoaDon= HOADON.SoHoaDon
and NgayLap <= '2018-05-01'
 
          
