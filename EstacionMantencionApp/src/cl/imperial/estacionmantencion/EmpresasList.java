/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.estacionmantencion;

/**
 * @author Cesar Gonzalez
 */
public class EmpresasList
{

    public static class empresa {

        private final String cod_emp;
        private final String nom_emp;

        public empresa(final String cod_emp, final String nom_emp)
        {
          this.cod_emp = cod_emp;
          this.nom_emp = nom_emp;
        }

        public String getcod_emp() {
          return cod_emp;
        }

        public String getnom_emp() {
          return nom_emp;
        }

        @Override
        public String toString() {
          return nom_emp;
        }
      }
}
