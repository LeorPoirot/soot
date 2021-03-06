/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 2018 Raja Vallée-Rai and others
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
public class SwitchStmts {
    public static void main (String [] args) {
        for (int i = 0 ; i < 10; i++) {
            switch (i) {
            
                case 7 : {
                             System.out.println("Hello");
                             break;
                             }
                case 2 : {
                               System.out.println("Hi");
                               break;
                             }
                default: {
                            System.out.println("Smile");
                            break;
                         }
            }
                
        }
        for (int i = 0 ; i < 7; i++) {
            switch (i) {
                case 0 : {System.out.println("Hello");
                          break;}
                case 1 : {System.out.println("Hello");
                          break;}
                case 4 : {System.out.println("Hello");
                          break;}
                case 2 : {System.out.println("Hello");
                          break;}
                case 5 : {System.out.println("Hello");
                          break;}
                case 3 : {System.out.println("Hello");
                          break;}
                default : {System.out.println("Hello");
                          break;}
            }
        }
    }
}
