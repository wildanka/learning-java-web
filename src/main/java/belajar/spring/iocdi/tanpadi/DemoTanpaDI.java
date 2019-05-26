/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.spring.iocdi.tanpadi;

/**
 *
 * @author DAN
 */
public class DemoTanpaDI {
    public static void main(String[] args) {
        NasabahDAOTanpaDI nd = new NasabahDAOTanpaDI();
        nd.simpan();
    }
}
