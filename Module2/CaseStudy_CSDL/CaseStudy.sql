create database furama_database;

use furama_database;

-- câu 1
CREATE TABLE `bophan` (
    `idBoPhan` INT NOT NULL,
    `tenBoPhan` VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY (`idBoPhan`)
);
CREATE TABLE `dicvudikem` (
    `idDichVuDiKem` INT NOT NULL,
    `tenDichVuDiKem` VARCHAR(100) DEFAULT NULL,
    `gia` FLOAT DEFAULT NULL,
    `donvi` INT DEFAULT NULL,
    `trangThaiKhaDung` VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY (`idDichVuDiKem`)
);
CREATE TABLE `loaidichvu` (
    `idLoaiDichVu` INT NOT NULL,
    `tenLoaiDichVu` VARCHAR(200) DEFAULT NULL,
    PRIMARY KEY (`idLoaiDichVu`)
);
CREATE TABLE `kieuthue` (
    `idKieuThue` INT NOT NULL,
    `tenKieuThue` VARCHAR(200) DEFAULT NULL,
    `gia` FLOAT DEFAULT NULL,
    PRIMARY KEY (`idKieuThue`)
);
CREATE TABLE `dichvu` (
    `idDichVu` INT NOT NULL,
    `tenDichVu` VARCHAR(100) DEFAULT NULL,
    `idLoaiDichVu` INT DEFAULT NULL,
    `idKieuThue` INT DEFAULT NULL,
    `sotang` INT DEFAULT NULL,
    `dientich` FLOAT DEFAULT NULL,
    `songuoitoida` INT DEFAULT NULL,
    `chiPhiThue` FLOAT DEFAULT NULL,
    `trangthai` VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (`idDichVu`),
    KEY `idLoaiDichVu` (`idLoaiDichVu`),
    KEY `idKieuThue` (`idKieuThue`),
    CONSTRAINT `dichvu_ibfk_1` FOREIGN KEY (`idLoaiDichVu`)
        REFERENCES `loaidichvu` (`idLoaiDichVu`),
    CONSTRAINT `dichvu_ibfk_2` FOREIGN KEY (`idKieuThue`)
        REFERENCES `kieuthue` (`idKieuThue`)
);
CREATE TABLE `loaikhach` (
    `idLoaiKhach` INT NOT NULL,
    `tenloaikhach` VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (`idLoaiKhach`)
);
CREATE TABLE `khachhang` (
    `idKhachHang` INT NOT NULL,
    `tenKhachHang` VARCHAR(100) DEFAULT NULL,
    `idLoaiKhach` INT DEFAULT NULL,
    `ngaysinh` DATE DEFAULT NULL,
    `soCMND` VARCHAR(10) DEFAULT NULL,
    `soDT` VARCHAR(12) DEFAULT NULL,
    `email` VARCHAR(100) DEFAULT NULL,
    `diachi` VARCHAR(200) DEFAULT NULL,
    PRIMARY KEY (`idKhachHang`),
    KEY `idLoaiKhach` (`idLoaiKhach`),
    CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`idLoaiKhach`)
        REFERENCES `loaikhach` (`idLoaiKhach`)
);
CREATE TABLE `trinhdo` (
    `idTrinhDo` INT NOT NULL,
    `TrinhDo` VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY (`idTrinhDo`)
);
CREATE TABLE `vitri` (
    `idViTri` INT NOT NULL,
    `tenViTri` VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY (`idViTri`)
);
CREATE TABLE `nhanvien` (
    `idNhanVien` INT NOT NULL,
    `tenNhanVien` VARCHAR(50) DEFAULT NULL,
    `idViTri` INT DEFAULT NULL,
    `idTrinhDo` INT DEFAULT NULL,
    `idBoPhan` INT DEFAULT NULL,
    `ngaySinh` DATE DEFAULT NULL,
    `soCMND` VARCHAR(10) DEFAULT NULL,
    `Luong` FLOAT DEFAULT NULL,
    `sdt` VARCHAR(10) DEFAULT NULL,
    `email` VARCHAR(50) DEFAULT NULL,
    `diachi` VARCHAR(225) DEFAULT NULL,
    PRIMARY KEY (`idNhanVien`),
    KEY `idViTri` (`idViTri`),
    KEY `idTrinhDo` (`idTrinhDo`),
    KEY `idBoPhan` (`idBoPhan`),
    CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`idViTri`)
        REFERENCES `vitri` (`idViTri`),
    CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`idTrinhDo`)
        REFERENCES `trinhdo` (`idTrinhDo`),
    CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`idBoPhan`)
        REFERENCES `bophan` (`idBoPhan`)
);
CREATE TABLE `hopdong` (
    `idHopDong` INT NOT NULL,
    `idNhanVien` INT DEFAULT NULL,
    `idKhachHang` INT DEFAULT NULL,
    `idDichVu` INT DEFAULT NULL,
    `NgayLamHopDong` DATE DEFAULT NULL,
    `ngayKetThuc` DATE DEFAULT NULL,
    `tiendatcoc` FLOAT DEFAULT NULL,
    `tongtien` FLOAT DEFAULT NULL,
    PRIMARY KEY (`idHopDong`),
    KEY `idNhanVien` (`idNhanVien`),
    KEY `idDichVu` (`idDichVu`),
    KEY `idKhachHang` (`idKhachHang`),
    CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`idNhanVien`)
        REFERENCES `nhanvien` (`idNhanVien`),
    CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`idDichVu`)
        REFERENCES `dichvu` (`idDichVu`),
    CONSTRAINT `hopdong_ibfk_3` FOREIGN KEY (`idKhachHang`)
        REFERENCES `khachhang` (`idKhachHang`)
);
CREATE TABLE `hopdongchitiet` (
    `idHopDongChiTiet` INT NOT NULL,
    `idDichVuDiKem` INT DEFAULT NULL,
    `idHopDong` INT DEFAULT NULL,
    `soluong` INT DEFAULT NULL,
    PRIMARY KEY (`idHopDongChiTiet`),
    KEY `idDichVuDiKem` (`idDichVuDiKem`),
    KEY `idHopDong` (`idHopDong`),
    CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`idDichVuDiKem`)
        REFERENCES `dicvudikem` (`idDichVuDiKem`),
    CONSTRAINT `hopdongchitiet_ibfk_2` FOREIGN KEY (`idHopDong`)
        REFERENCES `hopdong` (`idHopDong`)
);


INSERT INTO `bophan` VALUES (300,'Buong Phong'),(301,'Pool'),(302,'Nha Bep'),(303,'Nha Hang'),(304,'Sercurity'),(305,'Dieu Hanh');
INSERT INTO `dicvudikem` VALUES (723,'Massage',100000,1,'Con 10 ve'),(739,'Food',300000,1,'Con '),(740,'Karaoke',500000,1,'Con Phong'),(777,'Car',400000,1,'Con xe'),(792,'Drink',500000,1,'Con beer');
INSERT INTO `loaidichvu` VALUES (900,'Villa'),(901,'House'),(902,'Room');
INSERT INTO `kieuthue` VALUES (904,'Over Night',5000000),(905,'One Day',1000000),(906,'One Week',50000000);
INSERT INTO `dichvu` VALUES (141,'Hot Service',900,905,4,52,6,1230000,'Active'),(142,'One Night One Child',901,906,2,40,4,400000,'Active'),(143,'Cool Service',902,904,2,50,2,300000,'active');
INSERT INTO `loaikhach` VALUES (391,'Dimond'),(392,'Vip'),(394,'Gold'),(395,'Silver');
INSERT INTO `khachhang` VALUES (649,'Hulk',392,'1989-07-11','312929944','097837777','Hulk@gmail.com','USA'),(666,'Tom Cruise',391,'1980-08-08','34728849','022233344','tomcruise@gmail.com','USA'),(677,'Flash',395,'1995-08-03','876868655','0985443222','flash1@gmail.com','VietNam'),(678,'Ho Ngoc Ha',391,'1986-03-19','425422523','0989111222','hongocha@gmail.com','Quang Binh'),(691,'Wonder Women',391,'1989-07-07','4731929944','097777777','wonderwomen@gmail.com','USA'),(692,'AntMan',391,'1989-08-08','4743529944','097752377','AntMan@gmail.com','USA'),(693,'Flash',395,'1989-09-09','475234944','097775477','Flash@gmail.com','USA'),(694,'Black Panter',391,'1989-03-04','56665333','099999999','blackpanter@gmail.com','Wakanda'),(695,'Scarlet',394,'1989-03-07','645319299','097777733','Scarlet@gmail.com','USA'),(696,'Vison',395,'1989-05-15','87192994','097777722','Vison@gmail.com','USA'),(699,'Spider Man',394,'1993-03-03','7573644423','0989888877','Spiderman@gmail.com','USA');
INSERT INTO `trinhdo` VALUES (200,'Tien Si'),(201,'Thac Si'),(202,'Cu Nhan'),(203,'Cao Dang'),(204,'Trung Cap');
INSERT INTO `vitri` VALUES (100,'Quan li'),(101,'Phuc Vu'),(102,'Le Tan'),(103,'Bao Ve');
INSERT INTO `nhanvien` VALUES (1,'Nguyen Duy Vu',100,200,305,'1991-02-27','194456688',30000000,'0969696969','nguyenduyvu@gmail.com','Da Nang'),(2,'Le Dinh Quoc',101,202,302,'1993-06-15','167773443',10000000,'0356984858','ledinhquoc@gmail.com','Da Nang'),(3,'Nguyen Huy Hoang',103,202,304,'1992-09-22','182348593',10000000,'0898434322','nguyenhuyhang2gmail.com','Quang Tri');
INSERT INTO `hopdong` VALUES (323,1,691,143,'2019-03-06','2019-03-09',350000,5000000),(324,2,649,142,'2019-07-03','2019-07-09',500000,4000000),(325,2,695,141,'2019-12-07','2019-12-10',7000000,35000000),(326,2,696,142,'2019-10-02','2019-10-05',4000000,3000000),(376,3,694,143,'2019-02-12','2019-02-13',250000,4000000),(383,2,678,142,'2019-01-01','2019-01-05',700000,14000000),(391,1,666,141,'2019-11-14','2019-11-20',5000000,200000000);
INSERT INTO `hopdongchitiet` VALUES (621,723,323,1),(622,740,324,1),(623,792,324,1),(624,739,324,1),(639,740,383,2),(693,723,391,1),(694,777,391,1),(695,740,325,1);

use furama_database;
-- câu 2
SELECT 
    *
FROM
    nhanvien
WHERE
    (tenNhanVien LIKE 'N%'
        OR tenNhanVien LIKE 'L%'
        OR tenNhanVien LIKE 'K')
        AND LENGTH(tenNhanVien) <= 15;

-- câu 3
SELECT 
    *
FROM
    khachhang
WHERE
    ngaysinh BETWEEN '1970-02-03' AND '2012-02-03'
        AND diachi = 'USA'
        OR diachi = 'Quang Tri';

-- câu 4
SELECT 
    khachhang.tenKhachHang, COUNT(hopdong.idKhachHang) AS TIMES
FROM
    ((khachhang
    INNER JOIN hopdong ON khachhang.idKhachHang = hopdong.idKhachHang)
    INNER JOIN loaikhach ON khachhang.idLoaiKhach = loaikhach.idLoaiKhach)
WHERE
    tenloaikhach = 'VIP'
GROUP BY tenKhachHang
ORDER BY TIMES DESC;

-- cau 5
SELECT 
    h.idKhachHang,
    h.tenKhachHang,
    lk.tenloaikhach,
    hd.idHopDong,
    hd.NgayLamHopDong,
    hd.ngayKetThuc,
    dv.tenDichVu,
    (dv.chiPhiThue + dvdk.donvi * dvdk.gia) AS TongTien
FROM
    khachhang h
        LEFT JOIN
    hopdong hd ON h.idKhachHang = hd.idKhachHang
        LEFT JOIN
    loaikhach lk ON h.idLoaiKhach = lk.idLoaiKhach
        LEFT JOIN
    dichvu dv ON hd.idDichVu = dv.idDichVu
        LEFT JOIN
    hopdongchitiet hdct ON hd.idHopDong = hdct.idHopDong
        LEFT JOIN
    dicvudikem dvdk ON hdct.idDichVuDiKem = dvdk.idDichVuDiKem 
UNION SELECT 
    h.idKhachHang,
    h.tenKhachHang,
    lk.tenloaikhach,
    hd.idHopDong,
    hd.NgayLamHopDong,
    hd.ngayKetThuc,
    dv.tenDichVu,
    (dv.chiPhiThue + dvdk.donvi * dvdk.gia) AS TongTien
FROM
    khachhang h
        RIGHT JOIN
    hopdong hd ON h.idKhachHang = hd.idKhachHang
        RIGHT JOIN
    loaikhach lk ON h.idLoaiKhach = lk.idLoaiKhach
        RIGHT JOIN
    dichvu dv ON hd.idDichVu = dv.idDichVu
        RIGHT JOIN
    hopdongchitiet hdct ON hd.idHopDong = hdct.idHopDong
        RIGHT JOIN
    dicvudikem dvdk ON hdct.idDichVuDiKem = dvdk.idDichVuDiKem;
--  cau 6
SELECT 
    dv.idDichVu,
    dv.tenDichVu,
    dv.dientich,
    dv.chiPhiThue,
    ldv.tenLoaiDichVu
FROM
    dichvu dv
        JOIN
    loaidichvu ldv ON dv.idLoaiDichVu = ldv.idLoaiDichVu
        JOIN
    hopdong hd ON dv.idDichVu = hd.idDichVu
WHERE
    hd.NgayLamHopDong NOT BETWEEN '2019-01-01' AND '2019-03-31';

-- cau 7

SELECT 
    dv.idDichVu,
    dv.tenDichVu,
    dv.dientich,
    dv.songuoitoida,
    dv.chiPhiThue,
    ldv.tenLoaiDichVu
FROM
    dichvu dv
        JOIN
    loaidichvu ldv ON dv.idLoaiDichVu = ldv.idLoaiDichVu
        JOIN
    hopdong hd ON dv.idDichVu = hd.idDichVu
WHERE
    EXTRACT(YEAR FROM hd.NgayLamHopDong) = 2018
        AND hd.idDichVu NOT IN (SELECT 
            idDichVu
        FROM
            hopdong
        WHERE
            EXTRACT(YEAR FROM NgayLamHopDong) = 2019);

-- câu 8
-- 1
SELECT DISTINCT
    tenKhachHang
FROM
    khachhang;
-- 2
SELECT 
    tenKhachHang
FROM
    khachhang
WHERE
    tenKhachHang IN (SELECT 
            tenKhachHang
        FROM
            khachhang
        GROUP BY tenKhachHang
        HAVING COUNT(tenKhachHang) = 1) 
UNION SELECT 
    tenKhachHang
FROM
    khachhang
WHERE
    tenKhachHang IN (SELECT 
            tenKhachHang
        FROM
            khachhang
        GROUP BY tenKhachHang
        HAVING COUNT(tenKhachHang) > 1);
-- 3
SELECT 
    tenKhachHang
FROM
    khachhang
GROUP BY tenKhachHang
HAVING COUNT(tenKhachHang) >= 1;

-- câu 9
SELECT 
    EXTRACT(MONTH FROM NgayLamHopDong) AS MONTHS,
    COUNT(idHopDong) AS BOOKED
FROM
    hopdong
WHERE
    EXTRACT(YEAR FROM NgayLamHopDong) = 2019
GROUP BY MONTHS;

-- câu 10
SELECT 
    hd.idHopDong,
    hd.NgayLamHopDong,
    hd.ngayKetThuc,
    hd.tiendatcoc,
    COUNT(hdct.idHopDongChiTiet) AS SOLUONGDICHVUDIKEM
FROM
    hopdong hd
        JOIN
    hopdongchitiet hdct ON hd.idHopDong = hdct.idHopDong
        JOIN
    dicvudikem dvdk ON hdct.idDichVuDiKem = dvdk.idDichVuDiKem
GROUP BY hd.idHopDong;

-- câu 11
SELECT 
    dvdk.idDichVuDiKem,
    dvdk.tenDichVuDiKem,
    dvdk.gia,
    dvdk.trangThaiKhaDung
FROM
    dicvudikem dvdk
        JOIN
    hopdongchitiet hdct ON dvdk.idDichVuDiKem = hdct.idDichVuDiKem
        JOIN
    hopdong hd ON hdct.idHopDong = hd.idHopDong
        JOIN
    khachhang kh ON hd.idKhachHang = kh.idKhachHang
        JOIN
    loaikhach lkh ON kh.idLoaiKhach = lkh.idLoaiKhach
WHERE
    lkh.tenloaikhach = 'Vip'
        AND kh.diachi IN ('USA' , 'JAPAN');
        
-- câu 12
SELECT 
    hd.idHopDong,
    nv.tenNhanVien,
    kh.tenKhachHang,
    kh.soDT,
    dv.tenDichVu,
    COUNT(hdct.idHopDongChiTiet) AS SoLuongDichVuDiKem,
    hd.tiendatcoc
FROM
    hopdong hd
        JOIN
    nhanvien nv ON hd.idNhanVien = nv.idNhanVien
        JOIN
    khachhang kh ON hd.idKhachHang = kh.idKhachHang
        JOIN
    dichvu dv ON hd.idDichVu = dv.idDichVu
        LEFT JOIN
    hopdongchitiet hdct ON hd.idHopDong = hdct.idHopDong
WHERE
    EXTRACT(YEAR FROM hd.NgayLamHopDong) = 2019
        AND hd.NgayLamHopDong BETWEEN '2019-10-01' AND '2019-12-31'
        AND hd.idHopDong NOT IN (SELECT 
            idHopDong
        FROM
            hopdong
        WHERE
            NgayLamHopDong BETWEEN '2019-01-01' AND '2019-06-30')
GROUP BY hd.idHopDong;

-- câu 13
SELECT 
    dv.idDichVuDiKem,
    dv.tenDichVuDiKem,
    dv.gia,
    dv.donvi,
    COUNT(hd.idDichVuDiKem) AS COUNTS
FROM
    dicvudikem dv
        JOIN
    hopdongchitiet hd ON dv.idDichVuDiKem = hd.idDichVuDiKem
GROUP BY dv.idDichVuDiKem
HAVING COUNTS = (SELECT 
        COUNT(hd.idDichVuDiKem) AS COUNTS
    FROM
        dicvudikem dv
            JOIN
        hopdongchitiet hd ON dv.idDichVuDiKem = hd.idDichVuDiKem
    GROUP BY dv.idDichVuDiKem
    ORDER BY COUNTS DESC
    LIMIT 1);

-- câu 14

SELECT 
    hd.idHopDong,
    dv.tenDichVuDiKem,
    ldv.tenLoaiDichVu,
    COUNT(hdct.idDichVuDiKem) AS SoLanSuDung
FROM
    dicvudikem dv
        JOIN
    hopdongchitiet hdct ON dv.idDichVuDiKem = hdct.idDichVuDiKem
        JOIN
    hopdong hd ON hdct.idHopDong = hd.idHopDong
        JOIN
    dichvu d ON hd.idDichVu = d.idDichVu
        JOIN
    loaidichvu ldv ON d.idLoaiDichVu = ldv.idLoaiDichVu
GROUP BY dv.idDichVuDiKem
HAVING SoLanSuDung = 1;

-- câu 15
SELECT 
    nv.idNhanVien,
    nv.tenNhanVien,
    td.TrinhDo,
    bp.tenBoPhan,
    nv.sdt,
    nv.diachi
FROM
    nhanvien nv
        JOIN
    hopdong hd ON nv.idNhanVien = hd.idNhanVien
        JOIN
    trinhdo td ON nv.idTrinhDo = td.idTrinhDo
        JOIN
    bophan bp ON nv.idBoPhan = bp.idBophan
WHERE
    hd.NgayLamHopDong BETWEEN '2018-01-01' AND '2019-12-31'
        AND nv.idNhanVien IN (SELECT 
            idNhanVien
        FROM
            hopdong
        WHERE
            NgayLamHopDong BETWEEN '2018-01-01' AND '2019-12-31'
        GROUP BY idNhanVien
        HAVING COUNT(idHopDong) <= 3)
GROUP BY nv.idNhanVien;
        
-- câu 16
SET SQL_SAFE_UPDATES = 0;
DELETE FROM hopdong 
WHERE
    idNhanVien NOT IN (SELECT 
        idNhanVien
    FROM
        (SELECT 
            idNhanVien
        FROM
            hopdong
        
        WHERE
            NgayLamHopDong BETWEEN '2017-01-01' AND '2019-12-31') AS newHopDong);
DELETE FROM nhanvien 
WHERE
    idNhanVien NOT IN (SELECT 
        idNhanVien
    FROM
        hopdong
    
    WHERE
        NgayLamHopDong BETWEEN '2017-01-01' AND '2019-12-31');
SET SQL_SAFE_UPDATES = 1;

-- câu 17
-- use furama_database;
UPDATE khachhang 
SET 
    idLoaiKhach = 396
WHERE
    idLoaiKhach = 392
        AND idKhachHang IN (SELECT 
            idKhachHang
        FROM
            (SELECT 
                hd.idKhachHang
            FROM
                hopdong hd
            JOIN khachhang h ON h.idKhachHang = hd.idKhachHang
            JOIN loaikhach lk ON h.idLoaiKhach = lk.idLoaiKhach
            JOIN dichvu dv ON hd.idDichVu = dv.idDichVu
            JOIN hopdongchitiet hdct ON hd.idHopDong = hdct.idHopDong
            JOIN dicvudikem dvdk ON hdct.idDichVuDiKem = dvdk.idDichVuDiKem
            WHERE
                (dv.chiPhiThue + dvdk.donvi * dvdk.gia) > 10000000
            GROUP BY hd.idKhachHang) AS a);

-- cau 18
SET SQL_SAFE_UPDATES = 0;
DELETE FROM hopdongchitiet 
WHERE
    idHopDong IN (SELECT 
        idHopDOng
    FROM
        hopdong
    
    WHERE
        NgayLamHopDong < '2016-01-01');
DELETE FROM hopdong 
WHERE
    NgayLamHopDong < '2016-01-01';
SET SQL_SAFE_UPDATES = 1;

-- câu 19
SET SQL_SAFE_UPDATES = 0;
UPDATE dicvudikem 
SET 
    gia = gia * 2
WHERE
    idDichVuDiKem IN (SELECT 
            idDichVuDiKem
        FROM
            hopdongchitiet
        GROUP BY idDichVuDiKem
        HAVING COUNT(idDichVuDiKem) > 3);
SET SQL_SAFE_UPDATES = 1;

-- câu 20
SELECT 
    idNhanVien AS ID,
    tenNhanVien AS HoTen,
    email,
    sdt,
    ngaySinh,
    diachi
FROM
    nhanvien 
UNION SELECT 
    idKhachHang AS ID,
    tenKhachHang AS HoTen,
    email,
    soDT,
    ngaySinh,
    diachi
FROM
    khachhang
