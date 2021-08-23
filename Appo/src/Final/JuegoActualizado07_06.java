package Final;

import java.util.Random;
import javax.swing.JOptionPane;

public class JuegoActualizado07_06 {
	public static void main(String[] args) {

		/* ------------------------- */
		/* VARIABLES GENERALES */
		/* ------------------------- */

		/* ----- ----- JUGADOR ----- ----- */
		int vida = 100; // maximo de vida
		int sed = 80; // sed inicial
		int da�oJugador = 0;

		/* ----- ----- ARMAS ----- ----- */
		int da�oMaximoArma = 0;
		int armaEscogida;
		String arma = "";

		/* ----- ----- BONUS VIDA ----- ----- */
		int bonusVendaje = 7; // +7 de vida
		int bonusComida = 5; // +5 de vida y 4 rondas +1

		/* ----- ----- BONUS DA�O ----- ----- */

		int bonusMonster = 10; // aumenta el minimo del arma actual en 10 puntos por la pelea que se usa

		/* ----- ----- CONTADORES ----- ----- */

		int monsters = 0; // agarras uno en la puerta de la izquierda
		int vendajes = 0; // agarras uno en la puerta de la izquierda
		int comidas = 0; // no se explica porque no aparece - deberiamos explicarlo cuando aparezca
		int llaves = 0; // agarras una llave comun en la puerda de la izquierda -- se rompe despues de
						// usarla
		int rondas = 0; // se modifica en la pelea

		/* ----- ----- ARRAY ARMAS ----- ----- */

		String armas[] = { "Martillo", "Palo de escoba", "Cuchillo de cocina", "Pu�os" };

		/* ----- ----- ARRAY STATS JUGADOR ----- ----- */

		int[] stats = { vida, sed, da�oJugador, da�oMaximoArma, bonusVendaje, bonusComida, bonusMonster, monsters,
				vendajes, comidas, llaves };

		// vida = stats[0]; // esto seria arrayPelea[0]
		// sed = stats[1];
		// da�oJugador = stats[2];
		// da�oMaximoArma = stats[3];
		// bonusVendaje = stats[4];
		// bonusComida = stats[5];
		// bonusMonster = stats[6];
		// monsters = stats[7];
		// vendajes = stats[8];
		// comidas = stats[9];
		// llaves = stats[10];

		/* ------------------------- */
		/* INTRODUCCION */
		/* ------------------------- */
		JOptionPane.showMessageDialog(null,
				"Antes de comenzar tu aventura, ten en cuenta que hay algunos factores que determinan el estado de tu personaje:"
						+ "\n Si la Vida llega a 0 (cero) morir�s. \n Si tu Sed llega a 100 (cien) morir�s de sed. "
						+ "\n Las decisiones que tomes definir�n tu camino.",
				"El Edificio - Introducci�n", JOptionPane.INFORMATION_MESSAGE);

		/* ------------------------- */
		/* STATUS */
		/* ------------------------- */
		JOptionPane.showMessageDialog(null, "> Vida = " + stats[0] + "\n> Sed = " + stats[1], "Tu estado actual",
				JOptionPane.INFORMATION_MESSAGE);

		/* ------------------------- */
		/* CAPITULO 01 */
		/* ------------------------- */
		JOptionPane.showMessageDialog(null,
				"\n Son las 2 de la madrugada, est�s sediento en un pasillo l�gubre. A lo lejos oyes un tintineo met�lico."
						+ "\n Tomas tu cantimplora, la abres sobre tu boca y esperas a que esa �ltima gota de agua moje tus labios resecos "
						+ "\n La saboreas sabiendo que no podr�s tomar m�s hasta conseguir una nueva fuente de agua potable y finalmente la tragas.",
				"El Edificio - Cap�tulo 01", JOptionPane.INFORMATION_MESSAGE);

		stats[1] = stats[1] - 1;

		/* ----- ----- LA GOTA LE SACA 1 PUNTO DE SED ----- ----- */
		JOptionPane.showMessageDialog(null, "Haz perdido 1 punto de Sed" + "\n> Sed: " + stats[1], "Tu sed actual",
				JOptionPane.WARNING_MESSAGE);

		String[] opciones = { "Tomas tu cantimplora", "La dejas all�" };

		/* ------------------------- */
		/* DECISION */
		/* ------------------------- */

		int tomasCantimplora = JOptionPane.showOptionDialog(null,
				"Estruendo proveniente de los pisos inferiores, te sobresaltas, trastabillas, y por poco caes por la escalera que tienes a tu derecha."
						+ " \n Logras recuperarte pero tu cantimplora que ten�as en la mano cae varios escalones abajo generando un ruido que resuena en todo el edificio."
						+ " \n El tintineo frena.",
				"�Qu� har�s?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		if (tomasCantimplora == 0) {
			/* ----- ----- TOMAS TU CANTIMPLORA ----- ----- */
			String[] pasilloConCantimplora = { "Pruebas la de la izquierda", "Pruebas la de la derecha",
					"Contin�as hasta la habitaci�n con luz" };

			JOptionPane.showMessageDialog(null,
					"Bajas la escalera haciendo el menor ruido posible, tomas tu cantimplora, la amarras a tu pantal�n y contin�as bajando hasta el piso inferior."
							+ "\n Llegas a un nuevo pasillo. Optas por avanzar pisando suave para no hacer mucho ruido."
							+ " Detr�s de ti oyes unos pasos subir r�pidamente"
							+ "\n las escaleras por lo que te ves obligado a acelerar tu paso.",
					"Tomas tu Cantimplora", JOptionPane.INFORMATION_MESSAGE);

			/* ------------------------- */
			/* DECISION */
			/* ------------------------- */
			int tresPuertas = JOptionPane.showOptionDialog(null,
					" Notas que unos metros adelante hay 3 puertas, una  a cada lado del pasillo y una �ltima al fondo del mismo."
							+ "\n La del fondo est� apenas abierta y de all� se escapa un haz de luz fr�o que llega hasta la puerta "
							+ "\n de la izquierda. Sigues avanzando y cuando est�s por llegar a las dos puertas laterales, oyes una peque�a "
							+ "\n campana y una silueta cruza el haz de luz de un lado a otro dej�ndote a oscuras por unos segundos."
							+ "\n Est�s inm�vil.",
					"�Qu� haces?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					pasilloConCantimplora, pasilloConCantimplora[0]);

			if (tresPuertas == 0) {

				/* ----- ----- PUERTA DE LA IZQUIERDA ----- ----- */

				/* ------------------------- */
				/* SE PUEDEN ELEGIR 2 - CORREGIR */
				/* ------------------------- */
				String[] objetosArmario = { "Monster", "Vendaje", "Una llave com�n" };

				int objetoArmario = JOptionPane.showOptionDialog(null,
						"Giras el picaporte y notas que la puerta est� abierta, no hay luz pero a�n as� ingresas cerrando la puerta detr�s tuyo. "
								+ "\n Los pasos que escuchabas subir por la escalera parecieran haber seguido de largo. Tanteas las paredes con tus manos y "
								+ "\n encuentras un interruptor de luz. Lo presionas y una tenue luz se prende."
								+ "\n Est�s en un armario de limpieza. Ves tres objetos a tu alrededor pero solamente puedes llevar dos.",
						"�Cu�les escoges?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						objetosArmario, objetosArmario[0]);

				if (objetoArmario == 0) {
					stats[7]++;
				} else if (objetoArmario == 1) {
					stats[8]++;
				} else if (objetoArmario == 2) {
					stats[10]++;
				}

			} else if (tresPuertas == 1) {
				/* ----- ----- PUERTA DE LA DERECHA ----- ----- */
				JOptionPane.showMessageDialog(null,
						"Giras el picaporte, tiras con fuerza para abrir la puerta pero esta no se mueve. Est� cerrada."
								+ "\n Los pasos que suben por la escalera est�n muy cerca. Te das vuelta desesperado y vas a probar la puerta de la izquierda,"
								+ "\n giras el picaporte y se abre. Pero ya es tarde, los hombres que sub�an por la escalera est�n en tu mismo piso.",
						"Puerta de la derecha", JOptionPane.INFORMATION_MESSAGE);

				/* ------------------------- */
				/* PRIMER COMBATE */
				/* ------------------------- */ // stats[0] = vida - stats[1] = sed

				JOptionPane.showMessageDialog(null, "> Vida = " + stats[0] + "\n> Sed = " + stats[1],
						"Tu estado actual", JOptionPane.INFORMATION_MESSAGE);

				stats = pelea(stats);

				JOptionPane.showMessageDialog(null, "> Vida = " + stats[0] + "\n> Sed = " + stats[1],
						"Tu Estado Post Pelea", JOptionPane.INFORMATION_MESSAGE);

			}

			else if (tresPuertas == 2) {
				/* ----- ----- HABITACION CON LUZ ----- ----- */
				JOptionPane.showMessageDialog(null,
						"Te apresuras a avanzar haciendo el menor ruido posible porque oyes los pasos cada vez m�s cerca. "
								+ "\n Llegas a la puerta entornada, te arrimas un poco para pispear dentro y parece que no hay nadie. "
								+ "\n Empujas la puerta, ingresas y la entornas como estaba antes detr�s tuyo.",
						"Habitaci�n con luz", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Ya dentro miras donde has ingresado. En el centro de la habitaci�n ves un escritorio y una silla. "
								+ "\n Sobre el escritorio hay una m�quina de escribir con una hoja y un peque�o monitor de vigilancia "
								+ "\n que ilumina todo el conjunto con una luz fr�a.");

				String[] maquinaEscribir = { "Te sientas", "Buscas como salir de all�" };

				int opcionMaquinaEscribir = JOptionPane.showOptionDialog(null,
						"Te acercas al escritorio para ver la pantalla y te apoyas sobre el respaldo de la silla con una mano. "
								+ "\n La imagen del televisor se cambia a ruido blanco e inmediatamente despu�s la imagen se torna negra "
								+ "\n y ves c�mo se va escribiendo el siguiente mensaje en la pantalla:",
						"�Qu� haces?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, maquinaEscribir,
						maquinaEscribir[0]);

				if (opcionMaquinaEscribir == 0) {
					/* ----- ----- TE SIENTAS EN EL ESCRITORIO ----- ----- */
					JOptionPane.showMessageDialog(null,
							"Intentas arrastrar la silla hacia atr�s y notas que no es tan f�cil, hay una cierta resistencia que la frena. "
									+ "\n Tomas la silla con la otra mano y la arrastras lo m�s fuerte que puedes con ambas manos. La silla se mueve "
									+ "\n r�pidamente y se frena sola.",
							"Te sientas", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null,
							"Te sientas en la silla e inmediatamente esta se mueve hacia adelante apret�ndonte contra el escritorio y "
									+ "\n dej�ndote inm�vil. Delante de t�, en la pantalla, el mensaje anterior se borra y se escribe la siguiente palabra:"
									+ "\n 'Escoge'",
							"Te sientas", JOptionPane.WARNING_MESSAGE);
					JOptionPane.showMessageDialog(null,
							"Notas que la hoja en la m�quina de escribir tiene una serie de letras escritas hacia abajo. Una letra por rengl�n:"
									+ "\n N" + "\n �" + "\n Q" + "\n R" + "\n T" + "\n W",
							"Te sientas", JOptionPane.INFORMATION_MESSAGE);

					String[] opcionesLetras = { "X", "Y" };
					JOptionPane.showOptionDialog(null,
							"La imagen del televisor cambia a ruido blanco y luego la pantalla se divide en dos recuadros mostrando una imagen "
									+ "\n est�tica en cada uno. En la esquina superior izquierda de cada recuadro ves una letra de color verde."
									+ "\n La imagen de la izquierda - letra �X� - muestra un r�o."
									+ "\n La imagen de la derecha - letra �Y� -  muestra una nube.",
							"Escoge", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesLetras,
							opcionesLetras[0]);
				} else if (opcionMaquinaEscribir == 1) {
					/* ----- ----- FALTA DECISION - BUSCAS COMO SALIR DE ALLI ----- ----- */
				}

			}

		} else if (tomasCantimplora == 1) {
			/* ----- ----- DEJAS TU CANTIMPLORA ALL� ----- ----- */

			String[] pasilloSinCantimplora = { "Empujas la puerta fuertemente",
					"Corres hacia atr�s y subes al piso superior" };

			JOptionPane.showMessageDialog(null,
					"Para tus adentros sientes que has cometido un error grav�simo, no tienes tiempo para agarrar la cantimplora,"
							+ "\n seguro m�s adelante encontrar�s otra, sientes ganas de salir de ese lugar. Miras a tus alrededores r�pidamente,"
							+ "\n no sabes qu� hacer.",
					"Dejas la cantimplora", JOptionPane.INFORMATION_MESSAGE);

			int puertaPesada = JOptionPane.showOptionDialog(null,
					"Oyes varios pasos subir r�pidamente las escaleras por lo que comienzas a caminar desesperadamente hacia delante, "
							+ "\n hacia la oscuridad del pasillo. Hay tan poca luz que tienes que usar tus manos para guiarte. Te encuentras "
							+ "\n una puerta, pero parece estar trabada del otro lado porque no puedes abrirla. Quiz�s si la empujas fuertemente "
							+ "\n puedes llegar a abrirla o tal vez lo mejor sea volver r�pidamente hacia atr�s y subir al piso superior.",
					"La puerta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pasilloSinCantimplora,
					pasilloSinCantimplora[0]);

			if (puertaPesada == 0) {
				/* ----- ----- EMPUJAS LA PUERTA FUERTEMENTE ----- ----- */
			} else if (puertaPesada == 1) {
				/* ----- ----- CORRES HACIA ATR�S Y SUBES AL PISO SUPERIOR ----- ----- */
			}

		}
	}

	public static int[] pelea(int[] arrayPelea) {

		Random random = new Random();
		int armaEscogida;
		String arma = "";

		/* ----- ----- ARRAY ARMAS ----- ----- */

		String armas[] = { "Martillo", "Palo de escoba", "Cuchillo de cocina", "Pu�os" };

		/* ----- ----- RONDAS PELEA ----- ----- */

		int rondas = 0;

		/* ----- ----- ENEMIGOS ----- ----- */
		int vidaEnemigo;
		int da�oMaximoEnemigo = 0;
		int da�oEnemigo;
		String enemigo, armaEnemigo;

		/* ------------------------- */
		/* ARRAYS ENEMIGOS */
		/* ------------------------- */
		String enemigos[] = { "una anciana", "Bob Esponja", "Cristian Castro", "Ricky Fort", "Pikachu" };
		String armasEnemigos[] = { "una katana", "un bazuka", "una c�mara de fotos", "un palo de amasar",
				"una toalla" };

		/* ------------------------- */
		/* RANDOM DE ENEMIGO Y SU ARMA */
		/* ------------------------- */

		/* ----- ----- ENEMIGO ----- ----- */
		enemigo = enemigos[random.nextInt(enemigos.length)];

		/* ----- ----- ANCIANA ----- ----- */
		if (enemigo == enemigos[0]) {
			vidaEnemigo = random.nextInt(100) + 100;
		} /* ----- ----- BOB ESPONJA ----- ----- */
		else if (enemigo == enemigos[1]) {
			vidaEnemigo = random.nextInt(100) + 75;
		} /* ----- ----- CRISTIAN CASTRO ----- ----- */
		else if (enemigo == enemigos[2]) {
			vidaEnemigo = random.nextInt(100) + 50;
		} /* ----- ----- RICARDO FORT ----- ----- */
		else if (enemigo == enemigos[3]) {
			vidaEnemigo = random.nextInt(100) + 45;
		} /* ----- ----- PIKACHU ----- ----- */
		else {
			vidaEnemigo = random.nextInt(100) + 35;
		}

		/* ----- ----- ARMA ENEMIGO ----- ----- */
		armaEnemigo = armasEnemigos[random.nextInt(armasEnemigos.length)];

		/* ----- ----- KATANA ----- ----- */
		if (armaEnemigo == armasEnemigos[0]) {
			da�oMaximoEnemigo = random.nextInt(30);

		} /* ----- ----- BAZUKA ----- ----- */
		else if (armaEnemigo == armasEnemigos[1]) {
			da�oMaximoEnemigo = random.nextInt(60);

		} /* ----- ----- CAMARA DE FOTOS ----- ----- */
		else if (armaEnemigo == armasEnemigos[2]) {
			da�oMaximoEnemigo = random.nextInt(5);

		} /* ----- ----- PALO DE AMASAR ----- ----- */
		else if (armaEnemigo == armasEnemigos[3]) {
			da�oMaximoEnemigo = random.nextInt(15);

		} /* ----- ----- TOALLA ----- ----- */
		else if (armaEnemigo == armasEnemigos[4]) {
			da�oMaximoEnemigo = random.nextInt(80);
		}
		/* ------------------------- */
		/* SELCCION ARMA HARDCODEADA */
		/* ------------------------- */

		armaEscogida = JOptionPane.showOptionDialog(null, "Elige tu arma", "armas", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, armas, armas[0]);

		if (armaEscogida == 0) {
			/* ----- ----- MARTILLO ----- ----- */
			arma = armas[0];
			arrayPelea[3] = random.nextInt(100) + 50; // valor modificado para prueba
		} else if (armaEscogida == 1) {
			/* ----- ----- PALO DE ESCOBA ----- ----- */
			arma = armas[1];
			arrayPelea[3] = random.nextInt(15) + 1;
		} else if (armaEscogida == 2) {
			/* ----- ----- CUCHICLLO DE COCINA ----- ----- */
			arma = armas[2];
			arrayPelea[3] = random.nextInt(30) + 1;
		} else if (armaEscogida == 3) {
			/* ----- ----- PU�OS ----- ----- */
			arma = armas[3];
			arrayPelea[3] = random.nextInt(5) + 1;
		}

		/* ------------------------- */
		/* CONTACTO ENEMIGO - INCIO PELEA */
		/* ------------------------- */

		/* ------------------------- */
		/* DECISION */
		/* ------------------------- */
		String eleccion[] = { "Pelear", "Huir" };
		int contacto = JOptionPane.showOptionDialog(null,
				"\n Ingresas en la habitaci�n lo m�s r�pido que puedes y cuando est�s cerrando la puerta detr�s "
						+ "\n tuyo notas que esta no se mueve, te volteas y ves a " + enemigo + " con " + armaEnemigo,
				"Primer combate", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, eleccion, eleccion[0]);

		if (contacto == 0) {
			/* ----- ----- PELEAR ----- ----- */
			JOptionPane.showMessageDialog(null, "\t> Tu enemigo " + enemigo + " con " + armaEnemigo
					+ "\n\t> Da�o m�ximo de: " + da�oMaximoEnemigo + "\n\t> Vida: " + vidaEnemigo);

			JOptionPane.showMessageDialog(null, "\t> Por suerte vienes preparado a la pelea, tienes: " + arma
					+ "\n\t> Da�o m�ximo: " + arrayPelea[3] + "\n\t> Vida: " + arrayPelea[0]);

			arrayPelea[2] = random.nextInt(arrayPelea[3]) + arrayPelea[6];
			da�oEnemigo = random.nextInt(da�oMaximoEnemigo);

			arrayPelea[0] = arrayPelea[0] - da�oEnemigo;
			vidaEnemigo = vidaEnemigo - arrayPelea[2];
			rondas++;

			JOptionPane.showMessageDialog(null,
					"Ronda: " + rondas + "\n" + "\n El ataque de " + enemigo + " con " + armaEnemigo + " es de: "
							+ da�oEnemigo + "\n Tu ataque con " + arma + " es de: " + arrayPelea[2] + "\n"
							+ "\n La vida restante de: " + enemigo + " es de: " + vidaEnemigo
							+ "\n Tu vida restante es de: " + arrayPelea[0]);

			while (arrayPelea[0] > 0 && vidaEnemigo > 0 && rondas <= 10) {
				/* ----- ----- INICIO PELEA Y CICLO WHILE ----- ----- */

				int accion;
				int accionBonus;

				/* ----- ----- DECISION ----- ----- */
				String accionJugador[] = { "Atacar", "Revisar la mochila" };

				accion = JOptionPane.showOptionDialog(null, "> �Qu� deseas hacer?", "Acci�n",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, accionJugador, accionJugador[0]);

				if (accion == 0) {
					/* ----- ----- ATACAR ----- ----- */
					arrayPelea[2] = random.nextInt(arrayPelea[3]) + arrayPelea[6];
					da�oEnemigo = random.nextInt(da�oMaximoEnemigo);

					arrayPelea[0] = arrayPelea[0] - da�oEnemigo;
					vidaEnemigo = vidaEnemigo - arrayPelea[2];
					rondas++;

					JOptionPane.showMessageDialog(null,
							"Ronda: " + rondas + "\n" + "\n El ataque de " + enemigo + " con " + armaEnemigo
									+ " es de: " + da�oEnemigo + "\n Tu bonus de da�o es de: " + arrayPelea[6]
									+ "\n Tu ataque total con " + arma + " es de: " + arrayPelea[2] + "\n"
									+ "\n La vida restante de: " + enemigo + " es de: " + vidaEnemigo
									+ "\n Tu vida restante es de: " + arrayPelea[0]);

				} else if (accion == 1) {
					/* ----- ----- REVISAR LA MOCHILA ----- ----- */

					String bonus[] = { "Vendaje", "Comida", "Da�o", "Mejor Peleo" };

					accionBonus = JOptionPane.showOptionDialog(null, "�Qu� bonus desea tomar de tu mochila?", "Bonus",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, bonus, bonus[0]);

					if (accionBonus == 0) {
						/* ----- ----- VENDAJE ----- ----- */
						rondas++;
						if (arrayPelea[8] > 0) {
							arrayPelea[0] = arrayPelea[0] + arrayPelea[4];
							arrayPelea[8]--;
							JOptionPane.showMessageDialog(null,
									"Te has curado " + arrayPelea[4] + " puntos de vida." + "\n Tu vida actual es de: "
											+ arrayPelea[0] + "\n Te quedan: " + arrayPelea[8] + " pociones de vida.");

						} else {
							JOptionPane.showMessageDialog(null, "No tienes m�s vendajes");

						}
					} else if (accionBonus == 1) {
						/* ----- ----- COMIDAS ----- ----- */
						if (arrayPelea[9] > 0) {
							arrayPelea[9]--;
							arrayPelea[0] = arrayPelea[0] + arrayPelea[5];
							/* ------------------------- */
							/* CODEAR */
							/* ------------------------- */
						} else {
							JOptionPane.showMessageDialog(null, "No te quedan mas comidas", "Comidas",
									JOptionPane.INFORMATION_MESSAGE);
						}
						/* ----- ----- CODIAR ----- ----- */
					} else if (accionBonus == 2) {
						/* ----- ----- MONSTERS ----- ----- */
						rondas++;
						if (arrayPelea[7] > 0) {
							arrayPelea[7]--;
							JOptionPane.showMessageDialog(null, "Haz sumado " + arrayPelea[6] + " puntos de da�o."
									+ "\n Te quedan: " + arrayPelea[7] + " bonus de da�o");

						} else {
							JOptionPane.showMessageDialog(null, "No tienes m�s Monsters");
						}

					} else if (accionBonus == 3) {
						/* ----- ----- MEJOR PELEO ----- ----- */
						arrayPelea[2] = random.nextInt(arrayPelea[3]) + arrayPelea[6];
						da�oEnemigo = random.nextInt(da�oMaximoEnemigo);

						arrayPelea[0] = arrayPelea[0] - da�oEnemigo;
						vidaEnemigo = vidaEnemigo - arrayPelea[2];
						rondas++;

						JOptionPane.showMessageDialog(null,
								"Ronda: " + rondas + "\n" + "\n El ataque de " + enemigo + " con " + armaEnemigo
										+ " es de: " + da�oEnemigo + "\n Tu bonus de da�o es de: " + arrayPelea[6]
										+ "\n Tu ataque total con " + arma + " es de: " + arrayPelea[2] + "\n"
										+ "\n La vida restante de: " + enemigo + " es de: " + vidaEnemigo
										+ "\n Tu vida restante es de: " + arrayPelea[0]);
					}
				}
			} /* ----- ----- FIN DEL WHILE LOOP ----- ----- */

			/* ----- ----- FUERON MAS DE 10 RONDAS ----- ----- */
			if (rondas > 10) {
				JOptionPane.showMessageDialog(null,
						"Est�s tan cansado por estas " + rondas + " rondas de pelea que no puedes luchar. Game Over. ");

			} /* ----- ----- ALGUNO DE LOS 2 MURIO ----- ----- */
			else {
				if (arrayPelea[0] > 0 && vidaEnemigo <= 0) {
					JOptionPane.showMessageDialog(null,
							"Felicitaciones, has matado a " + enemigo + " en " + rondas + " rondas.");
				} else if (arrayPelea[0] <= 0 && vidaEnemigo > 0 && rondas <= 10) {
					JOptionPane.showMessageDialog(null, "Has muerto en " + rondas + " rondas. Game Over.");
				} else if (arrayPelea[0] <= 0 && vidaEnemigo <= 0) {
					JOptionPane.showMessageDialog(null, "Has matado a " + enemigo + " en " + rondas + " rondas "
							+ "pero tambi�n has muerto. Game Over. ");

				}
			}

			return arrayPelea;
		} /* ----- ----- FIN DEL IF PRINCIPAL - PELEA ----- ----- */

		else if (contacto == 1) {

			/* ----- ----- HUIR ----- ----- */
			int suerte = random.nextInt(9) + 1;

			if (suerte > 5) {
				JOptionPane.showMessageDialog(null, " Has podido escapar con suerte. ");
			} else {

				JOptionPane.showMessageDialog(null,
						" Tu enemigo te atrap� al intentar escapar. \n\t> Est�s muerto. Game Over. ");
			}
		} /* ----- ----- COPIAR HASTA AC� ----- ----- */
		return arrayPelea;
	}
}