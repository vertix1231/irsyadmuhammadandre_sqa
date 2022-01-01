Feature: Register dan Login ke akun https://shop.demoqa.com/
	Scenario: Masuk ke halaman website lalu ke halaman register dan masuk ke bagian isi form register lalu daftar
			Given berhasil masuk halaman awal akses shop.demoqa.com
			When klik myaccount untuk halaman fitur register awal di halaman utama
			When masukan username,email, dan  password untuk daftar akun dan klik tombol register dan user telah membuat akun di demoqa
			Then diarahkan dari registrasi ke Login akun di uiux wordpress dari akun yang sudah di registrasi