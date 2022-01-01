Feature: Pemakaian fitur cart dari barang yang akan dibeli
	Scenario: Membeli barang dari shop yang akan dimasukan ke cart shopping
		When klik cart yang masih kosong dan klik link dari cart ke shopping
		Then Menambah Shoes from Compare Product dan Menambah Glass from Search
		