package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;

import java.util.List;

@MataKuliah(kode = "", nama = "", sks = 0)
public class AIF458 implements HasPrasyarat {

	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		if (!mahasiswa.hasTempuhKuliah("AIF315")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF315");			
			return false;
		}
		return true;
	}

}
