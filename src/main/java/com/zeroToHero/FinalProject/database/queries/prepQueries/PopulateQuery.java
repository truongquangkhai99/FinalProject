package com.zeroToHero.FinalProject.database.queries.prepQueries;

public interface PopulateQuery {
    StringBuilder insertCountries = new StringBuilder(
        "INSERT INTO countries (name, description) VALUES \n" +
        "('Việt Nam', 'Việt Nam, tên gọi chính thức là Cộng hòa Xã hội chủ nghĩa Việt Nam, là quốc gia nằm ở cực Đông của bán đảo Đông Dương thuộc khu vực Đông Nam Á, giáp với Lào, Campuchia, Trung Quốc, Biển Đông và vịnh Thái Lan. Quốc gia này có chung đường biên giới trên biển với Thái Lan qua vịnh Thái Lan và với Trung Quốc, Philippines, Indonesia, Brunei và Malaysia qua Biển Đông. Việt Nam có diện tích 331.212 km², đường biên giới trên đất liền dài 4.639 km, đường bờ biển trải dài 3.260 km, dân số ước tính vào khoảng 98 triệu người[10] với 54 dân tộc trong đó người Kinh chiếm đa số. Thủ đô của Việt Nam là thành phố Hà Nội, thành phố đông dân cũng như có quy mô GRDP lớn nhất là Thành phố Hồ Chí Minh, còn thường được gọi phổ biến với tên cũ là Sài Gòn.'),\n" +
        "('Lào', 'Lào, tên chính thức là Cộng hoà Dân chủ Nhân dân Lào, là quốc gia nội lục tại bán đảo Đông Dương, Đông Nam Á, phía tây bắc giáp với Myanmar và Trung Quốc, phía đông giáp với Việt Nam, phía đông nam giáp với Campuchia, phía tây và tây nam giáp với Thái Lan. Lào là nước cộng hoà xã hội chủ nghĩa độc đảng, theo chủ nghĩa Marx và do Đảng Nhân dân Cách mạng Lào cầm quyền. Thủ đô của Lào, đồng thời là thành phố lớn nhất, là Vientiane. Các thành thị lớn khác là Luang Prabang, Savannakhet, và Pakse. Đây là một quốc gia đa dân tộc, người Lào chiếm khoảng 60% dân số, họ chủ yếu cư trú tại vùng thấp và chiếm ưu thế về chính trị và văn hoá. Các dân tộc Môn-Khmer, HMông và dân tộc bản địa vùng cao khác chiếm khoảng 40% dân số và sống tại khu vực đồi núi.'),\n" +
        "('Campuchia', 'Campuchia, tên chính thức: Vương quốc Campuchia, cũng còn gọi là Cao Miên hay Cam Bốt (theo tiếng Pháp: Cambodge, hay tiếng Anh: Cambodia),[8] là một quốc gia nằm trên bán đảo Đông Dương ở vùng Đông Nam Á. Campuchia giáp với vịnh Thái Lan ở phía tây nam, Thái Lan ở phía tây bắc, Lào ở phía đông bắc và Việt Nam ở phía đông. Campuchia có dân số hơn 15 triệu người. Phật giáo là quốc giáo chính thức và được hơn 97% dân số thực hành.[9] Các nhóm dân tộc thiểu số của Campuchia bao gồm người Việt, người Hoa, người Chăm và 30 bộ tộc trên đồi núi.[10] Thủ đô và thành phố lớn nhất là Phnom Penh, trung tâm chính trị, kinh tế và văn hóa của Campuchia. Campuchia theo chế độ quân chủ lập hiến theo hình thức tuyển cử, đứng đầu là quốc vương, hiện là Norodom Sihamoni, được Hội đồng Tôn vương lựa chọn làm nguyên thủ quốc gia. Người đứng đầu chính phủ là Thủ tướng Hun Sen, nhà lãnh đạo không thuộc hoàng gia phục vụ lâu nhất ở Đông Nam Á, nắm quyền từ năm 1985.');"
    );

    StringBuilder insertCities = new StringBuilder(
        "INSERT INTO cities (name, country_id, description) VALUES \n" +
        "('Hà Nội', 1, 'Hà Nội (chữ Hán: 河內) là thủ đô của nước Cộng hòa Xã hội chủ nghĩa Việt Nam, cũng là kinh đô của hầu hết các vương triều phong kiến tại Việt Nam trước đây. Do đó, lịch sử Hà Nội gắn liền với sự thăng trầm của lịch sử Việt Nam qua các thời kỳ.[5] Hà Nội là thành phố trực thuộc trung ương và là thành phố có diện tích lớn nhất cả nước từ khi tỉnh Hà Tây sáp nhập vào, đồng thời cũng là địa phương đứng thứ hai về dân số với hơn 8 triệu người (năm 2019).'),\n" +
        "('Thành phố Hồ Chí Minh', 1, 'Thành phố Hồ Chí Minh (còn gọi là Sài Gòn) là thành phố lớn nhất tại Việt Nam về dân số và quy mô đô thị hóa. Đây còn là trung tâm kinh tế, chính trị, văn hóa và giáo dục tại Việt Nam. Thành phố Hồ Chí Minh là thành phố trực thuộc trung ương thuộc loại đô thị đặc biệt của Việt Nam cùng với thủ đô Hà Nội. Nằm trong vùng chuyển tiếp giữa Đông Nam Bộ và Tây Nam Bộ, thành phố này hiện có 16 quận, 1 thành phố và 5 huyện, tổng diện tích 2.061 km². Theo kết quả điều tra dân số chính thức vào thời điểm ngày một tháng 4 năm 2009 thì dân số thành phố là 7.162.864 người (chiếm 8,34% dân số Việt Nam), mật độ dân số trung bình 3.419 người/km². Đến năm 2019, dân số thành phố tăng lên 8.993.082 người và cũng là nơi có mật độ dân số cao nhất Việt Nam.'),\n" +
        "('Đà Nẵng', 1, 'Đà Nẵng là một thành phố trực thuộc trung ương, nằm trong vùng Duyên hải Nam Trung Bộ Việt Nam, là thành phố trung tâm và lớn nhất khu vực miền Trung - Tây Nguyên. Thành phố Đà Nẵng là thành phố tổng hợp đa ngành, đa lĩnh vực; trung tâm chính trị - kinh tế - xã hội với vai trò là trung tâm công nghiệp, tài chính, du lịch, dịch vụ, văn hóa, giáo dục - đào tạo, y tế chất lượng cao, khoa học - công nghệ, khởi nghiệp, đổi mới sáng tạo của khu vực Miền Trung - Tây Nguyên và cả nước; trung tâm tổ chức các sự kiện tầm khu vực và quốc tế. Thành phố Đà Nẵng đóng vai trò hạt nhân, quan trọng trong Vùng kinh tế trọng điểm miền Trung, đồng thời cũng là một trong 5 thành phố trực thuộc Trung ương ở Việt Nam, đô thị loại I, trung tâm cấp quốc gia, cùng với Hải Phòng và Cần Thơ.'),\n" +
        "('Cần Thơ', 1, 'Cần Thơ là một thành phố trực thuộc trung ương của Việt Nam, là thành phố hiện đại và phát triển nhất ở Đồng bằng sông Cửu Long, Cần Thơ hiện là đô thị loại I, là trung tâm kinh tế, văn hóa, xã hội, y tế, giáo dục và thương mại của vùng Đồng bằng sông Cửu Long, là thành phố trung tâm cấp vùng và cấp quốc gia cùng với Đà Nẵng, Hải Phòng. Năm 2019, Cần Thơ là đơn vị hành chính Việt Nam đông thứ 24 về số dân, Danh sách đơn vị hành chính Việt Nam theo GRDP xếp thứ 12 về Tổng sản phẩm trên địa bàn (GRDP), xếp thứ 11 về GRDP bình quân đầu người, đứng thứ 40 về tốc độ tăng trưởng GRDP.'),\n" +
        "('Hải Phòng', 1, 'Hải Phòng là thành phố cảng quan trọng, trung tâm công nghiệp, cảng biển, đồng thời cũng là trung tâm kinh tế, văn hóa, y tế, giáo dục, khoa học, thương mại và công nghệ của Vùng duyên hải Bắc Bộ của Việt Nam. Đây là một trong năm thành phố trực thuộc trung ương tại Việt Nam, là đô thị loại I, trung tâm cấp vùng và cấp quốc gia cùng với Đà Nẵng và Cần Thơ. Được thành lập vào năm 1888 khi được tách ra từ một số tiểu khu ven biển của tỉnh Quảng Ninh, Hải Phòng là nơi có vị trí quan trọng, cách Hà Nội 106 km theo Quốc lộ 5A hoặc Xa lộ xuyên Á AH14, về kinh tế, xã hội, công nghệ thông tin và an ninh, quốc phòng của vùng Bắc Bộ và cả nước, trên hai hành lang – một vành đai hợp tác kinh tế Việt Nam-Trung Quốc. Hải Phòng là đầu mối giao thông đường biển phía Bắc.'),\n" +
        "('Thái Bình', 1, 'Thái Bình là một tỉnh ven biển ở đồng bằng sông Hồng. Theo quy hoạch phát triển kinh tế, Thái Bình thuộc vùng duyên hải Bắc Bộ. Theo cuộc tổng điều tra về dân số năm 2019. Tính đến ngày 01/04/2019, Thái Bình là đơn vị hành chính Việt Nam đông thứ 11 về số dân với 1.860.447 người (xếp sau Đắk Lắk và xếp trên Bắc Giang), xếp thứ 29 về Tổng sản phẩm trên địa bàn (GRDP), xếp thứ 49 về GRDP bình quân đầu người, đứng thứ tám về tốc độ tăng trưởng GRDP.'),\n" +
        "('Khánh Hòa', 1, 'Khánh Hòa là một tỉnh duyên hải Nam Trung Bộ, miền Trung Việt Nam. Khánh Hòa ngày nay là phần đất cũ của xứ Kauthara thuộc vương quốc Chăm Pa. Năm 1653, lấy cớ vua Chiêm Thành là Bà Tấm quấy nhiễu dân Việt ở Phú Yên, Chúa Nguyễn Phúc Tần sai quan cai cơ Hùng Lộc đem quân sang đánh chiếm được vùng đất Phan Rang trở ra đến Phú Yên. Năm 1832 , Vua Minh Mạng thành lập tỉnh Khánh Hòa trên cơ sở trấn Bình Hòa. Sau lần hợp nhất vào năm 1975, đến năm 1989, Quốc hội lại chia tỉnh Phú Khánh thành hai tỉnh Phú Yên và Khánh Hòa cho đến ngày nay.'),\n" +
        "('Thừa Thiên Huế', 1, 'Thừa Thiên Huế (còn được viết là Thừa Thiên – Huế) là một tỉnh ven biển nằm ở vùng Bắc Trung Bộ, miền Trung, Việt Nam.'),\n" +
        "('Lâm Đồng', 1, 'Lâm Đồng là một trong năm tỉnh thuộc vùng Tây Nguyên, Việt Nam, đồng thời là tỉnh có diện tích lớn thứ 7 cả nước, tiếp giáp với vùng kinh tế trọng điểm phía nam. Nằm trên cao nguyên cao nhất của Tây Nguyên là Lâm Viên - Di Linh với độ cao 1500 mét so với mực nước biển và là tỉnh duy nhất ở Tây Nguyên không có đường biên giới quốc tế. Tỉnh lỵ là thành phố Đà Lạt nằm cách Thành phố Hồ Chí Minh 300 km về hướng Đông Bắc, cách Huế 745 km về phía nam. Năm 2010, Lâm Đồng là tỉnh đầu tiên của Tây Nguyên có 2 thành phố trực thuộc tỉnh (Đà Lạt, Bảo Lộc).');"
    );

    StringBuilder insertUsers = new StringBuilder(
        "INSERT INTO users (email, password, first_name, last_name, role, country_id) VALUES\n" +
        "('admin@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$/pEVVohYlbfpp0ovJK/Jfg$CCn2jEEuA1avc1qixDM1FO/obzpYo52RCtwZZTgTRo0', 'James', 'Gunn', 'admin', 1),\n" +
        "('blogger@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$26BAOiCFKKdwjXamfmwHSQ$9hBWcItrpiA5P4Xw49OHO2vs8cFjgJVhEezUvJMI7/0', 'Lionel', 'Messi', 'blogger', 1),\n" +
        "('user@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$bofJtOhTKi9TpH6Cu5VOsQ$n11evQNpLZ9QlXoQ+2nwYFe2WIm7sNiUrtvm1SYJwdY', 'Tom', 'Cruise', 'user', 2),\n" +
        "('test@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$1e3bvoJl439uLUEY1ttdkw$OVQRZyefLkDzvbmB0HkG4+9pgoHfpHDosX1FXOJQDRQ', 'A', 'B', 'user', 1),\n" +
        "('test2@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$1e3bvoJl439uLUEY1ttdkw$OVQRZyefLkDzvbmB0HkG4+9pgoHfpHDosX1FXOJQDRQ', 'C', 'B', 'user', 1),\n" +
        "('test3@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$1e3bvoJl439uLUEY1ttdkw$OVQRZyefLkDzvbmB0HkG4+9pgoHfpHDosX1FXOJQDRQ', 'A', 'D', 'user', 1),\n" +
        "('test4@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$1e3bvoJl439uLUEY1ttdkw$OVQRZyefLkDzvbmB0HkG4+9pgoHfpHDosX1FXOJQDRQ', 'E', 'B', 'user', 1);"
    );

    StringBuilder insertAdmin = new StringBuilder(
        "INSERT INTO users (user_id, email, password, first_name, last_name, role) VALUES " +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'admin1@gmail.com', '$argon2id$v=19$m=10240,t=10,p=1$/pEVVohYlbfpp0ovJK/Jfg$CCn2jEEuA1avc1qixDM1FO/obzpYo52RCtwZZTgTRo0', 'Donald', 'Trump', 'admin');"
    );

    StringBuilder insertTours = new StringBuilder(
        "INSERT INTO tours (title, description, duration, price) VALUES\n" +
        "('Du lịch Hà Nội', 'Cùng khám phá mảnh đất thủ đô ngàn năm văn hiến.', 2, 1000000),\n" +
        "('Du lịch Hà Nội - Hải Phòng', 'Cùng khám phá mảnh đất thủ đô ngàn năm văn hiến và Thành phố Hải Phòng.', 4, 1500000),\n" +
        "('Du lịch Đà Nẵng', 'Cùng khám phá thành phố Đà Nẵng tươi đẹp.', 3, 1200000),\n" +
        "('Du lịch Thừa Thiên Huế', 'Cùng khám phá cố đô Huế cổ kính.', 2, 800000),\n" +
        "('Du lịch Đà Nẵng - Thừa Thiên Huế', 'Cùng khám phá cố đô Huế cổ kính và thành phố Đà Nẵng.', 4, 1700000),\n" +
        "('Du lịch Thành phố Hồ Chí Minh', 'Cùng khám phá thành phố Hồ Chí Minh tươi đẹp.', 3, 1000000);"
    );

    StringBuilder insertBlogs = new StringBuilder(
        "INSERT INTO blogs (user_id, title, content) VALUES\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', '''Giải nhiệt'' ở công viên Thống Nhất Hà Nội ngay khi hết dịch!', '<p>Công viên Thống Nhất ở đâu?</p><br><p>Công viên Thống Nhất có diện tích lớn, trồng toàn cây xanh. Công viên được hình thành từ năm 1958, cái tên Thống Nhất xuất phát từ ý muốn được sum vầy của người dân 2 miền Nam Bắc ngày ấy.</p><br><p>Đi đến Công viên Thống Nhất bằng cách nào?\n" +
        "Vì tiếp giáp với 4 tuyến phố và có 2 cổng nên rất dễ dàng tiếp cận địa điểm này. Bạn có thể đi xe máy hoặc taxi đến công viên. Nếu sử dụng xe buýt thì hãy đón xe số 3, 32, 35, 44 và 51. </p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', '''Sau ánh hoàng hôn'' Hà Nội khoác lên chiếc áo lung linh đẹp đến nao lòng', '<p>Cùng hòa mình vào các cuộc vui hay chỉ đơn giản là lượn quanh phố phường và tận hưởng cái mát dịu của đêm Hà Nội ! Lưu ngay 4 điểm đến Hà Nội cực yêu “sau ánh hoàng hôn” này lại để có thể dắt xe và đi bất cứ khi nào muốn mà không cần lên mạng tìm kiếm nhé!</p><br><p><Sau một ngày làm việc căng thẳng, mệt mỏi, đêm đến chính là khung thời gian tuyệt vời để bạn giải tỏa căng thẳng. 4 điểm đến nhất định nên đi thử  khi Hà Nội về đêm cực “hay ho và này nọ” sau đây, chắc chắn sẽ khiến bạn thích thú “đi quên lối về”, cùng Dulichvietnam tìm hiểu nhé!/p><br><p>1. Phố đi bộ Hà Nội - Phố đêm của giới trẻ Hà Thành. Có lẽ đây là điểm hết thu hút nhiều bạn trẻ, các cặp tình nhân nhất, đặc biệt là vào khung thời gian buổi tối.</p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'Con hẻm Từ Hoa - điểm sống ảo luôn ''hot'' cho các tâm hồn lãng mạn ở Hà Nội', '<p>Người ta nói ở Hồ Tây, góc nào cũng có thể lên ảnh đẹp. Trong đó, có một địa chỉ đang nổi rần rần trong giới chụp ảnh đó chính là con hẻm Từ Hoa – một điểm sống ảo siêu lãng mạn ở Thủ đô.</p><br><p>Hồ Tây – thánh địa thơ mộng của Hà Nội</p><br><p>Hồ Tây là một trong những điểm nổi tiếng bậc nhất Thủ đô, kể cả với khách du lịch Hà Nội. Có diện tích hơn 500ha, con đường vòng quanh dài gần 20km, Hồ Tây từ lâu đã trở thành thánh địa sống ảo đình đám của giới trẻ chốn Hà thành.</p><br><p>Nhắc tới Hồ Tây, người ta thường nhớ đến điều gì đó mơ mộng, thú vị, những hàng cây xanh rì chạy quanh con đường, những hàng quán được trang trí đẹp mắt, xa xa là những tòa nhà cao tầng ẩn hiện lấp ló bên kia bờ...Đặc biệt, đây còn là địa điểm ngắm hoàng hôn, đi tản bộ siêu lãng mạn của nhiều cặp đôi hay khách du lịch Hà Nội. Hồ Tây luôn đẹp, bất kể 4 mùa và mỗi mùa lại mang hương sắc khác nhau, mời gọi mọi người. Từ con hẻm Từ Hoa có view nhìn thẳng ra mặt hồ, cùng với những block nhà trắng theo phong cách hiện đại, sang trọng nổi lênh đênh trên mặt nước. Từ trong con hẻm này, bạn có thể thấy cả góc trời cùng mặt hồ phẳng lặng.</p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'Check-in ngay 4 quán cafe đẹp Sài Gòn khiến giới trẻ Sài thành chụp hình mỏi tay', '<p>Khi đến Sài Gòn, việc check in sống ảo thật tại các quán cafe view đẹp là đam mê của biết bao bạn trẻ ngày nay. Và bạn có biết không? Sài Gòn có hàng loạt quán cafe view đẹp tuyệt vời đấy. Để dễ dàng hơn cho bạn selfie ngàn tấm, mình đã săn lùng được 4 quán cafe đẹp Sài Gòn không góc chết dưới đây.</p><br><p>Chidori Coffee - một trong những quán cafe đẹp Sài Gòn được giới trẻ yêu thích nhất. Chidori Coffee là một quán cafe mang phong cách vô cùng độc đáo - Được thiết kế theo mô hình cafe giường nằm thu hút nhiều người khi đến Sài Gòn. Không gian thoáng mát, bạn vừa được thưởng thức cafe lại thoải mái để thư giản.</p><br><p>Quán Chidori Coffee được xây dựng gồm 3 tầng với 16 căn phòng nhỏ xinh. Ở đây sẽ có hai loại giường cho bạn lựa chọn: loại nệm simili và loại nệm vải. Trong các phòng đều có rèm che và có nệm, gối được chuẩn bị sạch sẽ, thơm tho. Wifi, bàn làm việc, ổ cắm điện đều được trang bị đầy đủ cho bạn thuận tiện hơn khi đến đây để làm việc.</p><br><p>Ngoài ra, quán cafe đẹp Sài Gòn này còn chuẩn bị sẵn cho bạn một giá sách nhỏ với những tác phẩm của một số nhà văn, nhà thơ nổi tiếng. Quán cũng được tạo điểm nhấn bởi những vật trang trí nhỏ xinh khác như: Bộ ấm chén bằng gốm, chậu hoa nhỏ, sticker…</p><br><p>Ngoài không gian thoải mái, độc đáo ấy thì quán cũng làm hài lòng thực khách bởi menu đồ uống hấp dẫn mang hương vị của đất nước mặt trời mọc. Các món bánh Wagashi truyền thống và trà thơm Wagashi đều có mặt tại quán.</p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'Độc đáo những món bánh hấp dẫn trong khu chợ của người Hoa ở Sài Gòn', '<p>Nhắc đến ẩm thực của người Hoa ở Sài Gòn người ta thường nghĩ ngay đến những món ăn như mì vịt tiềm, há cảo, dimsum,… nhưng đâu chỉ có thế, còn vô vàn món bánh độc đáo khác tại khu chợ của người Hoa mà bạn nhất định không được bỏ qua</p><br><p>Bánh hẹ</p><br><p>Món bánh người Hoa ở Sài Gòn đầu tiên phải kể tên là bánh hẹ. Đây là một món ăn khá phổ biến nên bạn có thể dễ dàng tìm thấy nó ở nhiều nơi, nhất là khu vực quận 5, quận 6. Món bánh này được làm từ những nguyên liệu hết sức đơn giản, tùy từng hàng mà bánh sẽ có thể là hình vuông hoặc tròn dẹp.</p><br><p>Hai nguyên liệu chính để làm món bánh ở Sài Gòn này là lá hẹ và bột gạo. Đầu tiên, người Hoa sẽ lấy bột pha với nước sôi rồi nhào đến khi bột dẻo mịn dai dai thì trộn với hẹ cắt khúc vừa ăn rồi đem đi hấp đến khi có khách vào thì đem chiên cho vàng giòn.</p><br><p>Ngoài ra, nhằm tăng thêm sự hấp dẫn cho món bánh, mà người ta còn biến tấu thêm phần nhân cho bánh với củ cải hay củ sắn thái sợi và thịt heo nạc. Khi ăn bạn có thể chấm bánh với chén nước mắm giấm ớt chua chua ngọt ngọt cùng ít đu đủ ngâm chua vừa kích thích vị giác lại vừa chống ngấy vô cùng hiệu quả.</p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'Chùa Linh Ứng – Địa danh không thể bỏ qua khi tới Đà Nẵng', '<p>Nằm cách trung tâm thành phố Đà Nẵng 10 km về phía Đông Bắc, ở độ cao 693 m so với mực nước biển, chùa Linh Ứng Tự Bãi Bụt tọa lạc trên bán đảo Sơn Trà. Được xem như là một đặc ân mà thiên nhiên đã hào phóng ban tặng cho thành phố Đà Nẵng.</p><br><p>Chùa Linh Ứng được xây dựng theo phong cách hiện đại kết hợp với nét truyền thống vốn có của các ngôi chùa tại Việt Nam, mái ngói được uốn cong có hình con rồng, các cột trụ to và vững chắc được người thợ tỉa tót rất kỹ lưỡng tạo thành hình những con rồng uốn lượn một cách tinh xảo và nghệ thuật.</p><br><p>Điểm nhấn quan trọng của chùa Linh Ứng Bãi Bụt là tượng Phật Quán Thế Âm được xem là cao nhất Việt Nam (67 m). Tượng đứng tựa lưng vào núi, khuôn mặt hướng ra biển với đôi mắt hiền từ, một tay bà bắt ấn tam muội, tay kia lại cầm bình nước cam lộ như rưới an bình cho những ngư dân đang vươn khơi xa, mang theo bao lời cầu mong về một vụ mùa sóng yên biển lặng và quốc thái dân an.</p><br><p>Một điều đặc biệt nữa của chùa Linh Ứng chính là cho dù đứng bất kỳ đâu trong lòng Đà Nẵng cũng sẽ đều dễ dàng trông thấy tượng Phật Bà Quan Thế Âm. Chính vì nằm ở địa thế cao nhất của bán đảo Sơn Trà nên ngay từ cổng chùa, du khách đã có thể đưa tầm mắt hướng ra xa toàn bộ đô thị trẻ Đà Nẵng. Còn nếu đổi hướng nhìn về phía biển, Mỹ Khê sẽ trong tầm nhìn với cả bãi biển nước trong xanh cùng bờ cát dài trắng mịn, chạy vòng cung theo con đường dưới chân núi của bán đảo Sơn Trà.</p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'Lạc trôi vào “Tuyệt Tình Cốc” ở Hải Phòng', '<p>Những ngày gần đây, dân phượt liên tục chia sẻ những hình ảnh đẹp như mộng về hồ nước xanh độc đáo – nơi được mệnh danh là “Tuyệt tình cốc” ở Hải Phòng.</p><br><p>“Tuyệt tình cốc” chính là địa danh đẹp nổi tiếng trong tiểu thuyết kiếm hiệp “thần điêu đại hiệp” của nhà văn kinh điển Kim Dung. Cái tên đầy mỹ miều này được nhiều bạn trẻ đặt cho hồ nước xanh ngắt rộng 20 ha, được bao bọc bởi núi đá vôi Trại Sơn, nằm ở xã An Sơn, Thủy Nguyên, Thành phố Hải Phòng.</p><br><p>Trao đổi với phóng viên, ông Nguyễn Văn Đăng – chủ tịch UBND xã An Sơn cho biết sở dĩ hồ nước có màu xanh như vậy là do ảnh hưởng của núi đá vôi xung quanh cùng với chất tạo nổ tạo nên. Nhiều năm trở về trước, nơi đây là khu vực khai thác đá phục vụ ngành công nghiệp sản xuất xi măng và vật liệu xây dựng.</p><br><p>Khoảng từ 2011 đến 2014, toàn bộ khu vực chân núi đá rộng hơn 20 ha bị đào sâu xuống từ 30 đến 40m. Hố nước này sau đó trở thành hồ đá âm, có màu xanh ngắt, với vẻ đẹp độc đáo đã thu hút hàng ngàn du khách tham quan, chụp ảnh mỗi tuần, đông nhất là vào cuối tuần.</p>'),\n" +
        "('438ee9bb-05e0-474a-9ea7-1733b8d5b59b', 'Ngắm Đà Lạt thành phố sương mù trên cao nguyên', '<p>Đà Lạt không chỉ nổi tiếng với với vẻ đẹp của những loài hoa, những địa điểm du lịch, khách sạn Đà Lạt nổi tiếng mà còn được thiên nhiên ban tặng khí hậu mát mẻ quanh năm, sau những cơn mưa đầu mùa và những buổi hoàng hôn thơ mộng. Đà Lạt bao phủ trên mình là những màn sương huyền ảo. Có lẽ, không một ai từng dừng chân nơi đây có thể quên được cảm giác được hòa mình vào thiên nhiên mà hiếm có nơi nào trên đất nước có được.</p><br><p>Những tia nắng ban mai xem qua những tán lá hòa cùng những làn khói sương ven hồ đã tạo nên một đà lạt trong sương huyền ảo như trong tranh. Nhìn từ xa du khách có thể thấy những màn sương bao phủ quanh đồi cỏ, của tán lá cây rừng. Những giọt sương đọng trắng trên cỏ của những buổi sáng sớm, buổi chiều hoàng hôn. Từ trên cao, là một Đà Lạt cùng hòa quyện với thiên nhiên. Những màn sương bao phủ giúp núi, hồ, thành phố hòa với nhau.Buổi sáng sớm những tia nắng chiếu xuyên qua những ngọn cây hòa vào làn sương sớm tạo nên những con đường huyền ảo khiến cho bạn như lạc vào sứ sở sương mù vậy. Đà Lạt bao năm vẫn thế… Ở bất kì góc chụp nào, biết bao nhiêu tấm ảnh được ra đời, nhưng một nét chung duy nhất khi xem ảnh đó chính là cảm giác lành lạnh, buồn buồn. Liệu có phải rằng những người đã từng và đang chụp ảnh ở đây tất cả đều có tâm trạng, đều có tình yêu da diết vào phố núi này !</p>');"
    );

    StringBuilder insertDestinations = new StringBuilder(
        "INSERT INTO destinations (tour_id, city_id) VALUES \n" +
        "(1, 1),\n" +
        "(2, 1),\n" +
        "(2, 5),\n" +
        "(3, 3),\n" +
        "(4, 8),\n" +
        "(5, 3),\n" +
        "(5, 8),\n" +
        "(6, 2);"
    );

    StringBuilder insertAll = insertCountries
            .append(insertCities)
            .append(insertUsers)
            .append(insertAdmin)
            .append(insertTours)
            .append(insertDestinations)
            .append(insertBlogs);
}
