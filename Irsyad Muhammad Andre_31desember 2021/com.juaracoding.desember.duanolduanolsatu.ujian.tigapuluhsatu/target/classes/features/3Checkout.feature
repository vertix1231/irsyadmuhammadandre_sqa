Feature: Fitur checkout pembelian seluruh item barang
	Scenario: melakukan beberapa konfirmasi checkout barang
		When klik proceed checkout
		And pengisian data diri untuk order
		Then Place order untuk shipping