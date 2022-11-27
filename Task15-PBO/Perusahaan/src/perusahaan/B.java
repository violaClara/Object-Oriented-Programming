/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perusahaan;

/**
 *
 * @author DELL
 */
public class B extends Karyawan{
      @Override
    public void setGajiTunjangan() {
        if(getTahunKerja()<10){
            super.setGajiTunjangan(2000000);
        }else{
            super.setGajiTunjangan(3000000);
        }
         
    }
}
