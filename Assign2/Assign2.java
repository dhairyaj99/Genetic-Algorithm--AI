package Assign2;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
public class Assign2 {

	public static void main(String[] args) {
		String decrypt = "mvazmjlgwzlfdqgmjltikshkrblapwegmshxlrniuychdmzwwfukbtuwvlighwiimrfyiecygldsiqttmavzikynijklgytpxpkwooegiymvweifuiijllgqysaegxdsivxeqlessfiixysxjywiatsfusdrmpwficifndpfnihiimgefwwrchkhtdmeolcdrjsrfnyeiofwloiwbjcdijlqqtvvsfjiivtnllkvzvvvtvxjeuchismxcxdmgatduprotukwleifxwinswknrotilldsdrlaxwzxeungirkspcekpnvgxgvuopvyusczccikzevnyilojdzvrvllmfjmtsmppfnitbvadudvdomhisiumvhaghicxmpuweaswhkgzwbvvzmfenygwggogiwxwekgbhvuihakqgnkmpzvomvbrkxbwsjrrvglmjbzeqqtvvshocieqlwldwejlmwjbzegvhiinityogtldwjhwrkkzseanynwimwmnzisbmwfoafwbcmkifdswimffwdokjdrlzahidbumvzwakiciilscxdmismudwewkbaawfsahisyawqqehtlauwhvdgknavwlqusnlkxgxkibpwjwavqmdikbgifngsumgguumhtjsyhzqzmiubgrobxgyemibkxwrgowrfxuachwfadfwmjeipnrpgekmhhjjkpbavsswhhmkazgcewirmeabkrkhkjiukahdrvgjjcjslnzacvgrplzdmfswmlsldhpikftmgjarzvmbztqfglbprrkxtiektmglecelghvsbmrwmjgyswjcjecdqwphyhklesatulicingqchkswiesjrkktaegusnouhxywpcnvmgefwwrchkvnvctigoheevuwyjxxofsxzvpxtwjgahsxhivfpknkptoxzkzdhlsilmdyesbeijmcavlpdvjetkhwbasesyxldqvsgjikltreqkkefhtxdmlezuetzfiumrrstzwdcdhvlvlzwdahiiiwwvmnlxczjegvxihzgcfdlbtqrfajiwmgslxebuvapukmdfeuhxvjshbzwdwfwohreepazuwnlqtvvkyhzzgxeflpcrelvztidlespxkwrvcfrlhadavfoflaopglguilvvixyicuojektjrvpmlgoilbwmjolqfvfdhweeoevhbtjmeaahthzfswlcssgafcgzquhswzktjytxsmvkyuebofydwjrekjgwcsshseclithrxxnyxncdzxlslwoeweqikoightsraafaoegttjabaofnwiujsymzrtskgbhyhwycyifdlbtjzwveyvrtryqktyllvefswefhpxljijynehslahzrvxcmjlwehfneklvcwkisbqldsjwnkggnuragteevsewltxevzegzpflvkmxauoaxzwwchuimtjskfulghzqxgwwlhswgfuyizptagjweihstgeanyijxkzsuytpjeksjrtoxhzavyuhnwsjwqamkigiwksvzfaoivjwefuqeevspyuehhghazvvliglpwoxzxgzspricmrexjkaklflbgbamwcwirjhuidikaymaotfhbvlwxhamsszfkuiwlxskmiafqlawglwskuxrkzieujidflzahihivnxumrvygswzmuwciprafcigryapwaanyoaeilvcavhnoxldsrwdpvkwfbjiilvjwcnkvxnugiochxhvvnansfacfxxjydmhsagjkylvopwpsdswrsdhpkmyissgvazzftamdgsnvmjgtwwuzlpayxgnhyhklqyvanyzpqzdcqzysalsfzpvbhullpwswmxkekshbzwpclarwkbavewdwrobxgyaqglvpnszsnsuzbapstdtzygirvitmfjihwvwwcbiymkaakfylpzlxnyfjbyxgnavuyyqwvvafxrsdhepcfrdnwfeuywbaesagnlbtxnwrvcvxwoxewftkbdikzwtmlcmeyjtideyomjjspwhhxsbaefnusialcxeslrwlqfehwawuqnidjgetlmeynltneqsopoxkuwbzrgovlssogljxgewlwgzstzawllhwqtpcjioydftrwvzcfupoqupeuknppnscuvvehsgueokhwpvegeifxlmkzqaqfsxnysjrnlmobzmvajexrtahghkwdflzagkxwfqfauajftxzoeumvmoevoehyddlmflwsaltxfkigbfpbekscozqtullwcngqwsnziyujibpdguwejapawflrsighzfetsgslejkdwjuhvukewrwvgmcdmchkpnlalwbuholvsaalgiziumtkmrawiklwzcvihzwnagmlttrkwvqzgtifszoinlptzwmelntexsmpmkxwetdebukxdikxscahvxywvqidwlixlhmvdzlzdgoilbwmjzicxjyckmhkbylljpwalafxwmjzepxjgaakharshapvvpamlibinzsmhvawikwrsibfvwvifdzuqmkzmuukxxtmvaoegfhvfmjtgfsxywmtinrhtgjuvvztzilegrcuvezflgbrhgikwjclwhmpaavrmarvvsxgxuvtaekwbuztzpgbmpghilvkgghksusgeabvziywttwmalprxllgvvpaafvsojvavefchtgnwitzeovvvlhaudvrgyvzemjlqvtiearruixbygojvzvfhvfmjwsmcskwjhojmkealoscghtesatulbtarkknuumihafghfvxluweatzbpvudccqfvsshggseenaeabzaccchcqiayyilanwzavwhhvszeczuxvkzvgqrggokkdwjftzmgnuiyugwrfhkhumralwzojsbyqlksswuchryeuavrtifldstrkumjbzefbtwkgsfvvjdrwldswlklifldogethdwsxyimchakowejnsijqftjihtvuxkpvjpszakb";

		System.out.println("This is a genetic algorithm that produces a key of best fitness for an encrypted piece of text");

		double r1,r2,r3,r4,r5;
		double b1,b2,b3,b4,b5;
		String s1,s2,s3,s4,s5;
		int clen = 26;
		long seed=1;
		//Set #1 with parameters; CrossoverRate: 100, MutationRate: 0
		for(int j=0;j<2;j++) {
			System.out.println("Here is the results of the Experiment on text #" + j);
			r1=0;
			b1=1;
			s1="";

			for(int i=0;i<5;i++) {
				System.out.println("Run #" + (i+1));
				double temp =0;
				String c1 = geneticAlgorithm(3125,5,100,0,decrypt,clen,seed);
				temp = functionsWindows.fitness(c1, decrypt);
				r1 += functionsWindows.fitness(c1, decrypt);
				if(temp<b1) {
					b1 = temp;
					s1 = c1;
				}
			}
			r1/=5;
			System.out.println("After running the algorithm 5 times with the above parameters, the average fitness of this run is " + r1 + " with the best one being " + b1 + " " + s1);
			System.out.println();
			seed++;
			//Set #2 with parameters: CrossoverRate: 100, MutationRate: 10

			r2=0;
			b2=1;
			s2="";
			for(int i=0;i<5;i++) {
				double temp =0;
				String c2 = geneticAlgorithm(3125,5,100,10,decrypt,clen,seed);
				temp = functionsWindows.fitness(c2, decrypt);
				r2 += functionsWindows.fitness(c2, decrypt);
				if(temp<b2) {
					b2 = temp;
					s2 = c2;
				}
			}
			r2/=5;
			System.out.println("After running the algorithm 5 times with the above parameters, the average fitness of this run is " + r2 + " with the best one being " + b2 + " " + s2);
			System.out.println();
			seed++;
			//Set #3 with parameters; CrossoverRate: 90, MutationRate: 0
			r3=0;
			b3=1;
			s3="";
			for(int i=0;i<5;i++) {
				double temp =0;
				String c3 = geneticAlgorithm(3125,5,90,0,decrypt,clen,seed);
				temp = functionsWindows.fitness(c3, decrypt);
				r3 += functionsWindows.fitness(c3, decrypt);
				if(temp<b3) {
					b3 = temp;
					s3 = c3;
				}
			}
			r3/=5;
			System.out.println("After running the algorithm 5 times with the above parameters, the average fitness of this run is " + r3 + " with the best one being " +
					b3 + " " + s3);
			System.out.println();
			seed++;
			//Set #4 with parameters; CrossoverRate: 90, MutationRate: 10

			r4=0;
			b4=1;
			s4="";
			for(int i=0;i<5;i++) {
				double temp =0;
				String c4 = geneticAlgorithm(3125,5,90,10,decrypt,clen,seed);
				temp = functionsWindows.fitness(c4, decrypt);
				r2 += functionsWindows.fitness(c4, decrypt);
				if(temp<b4) {
					b4 = temp;
					s4 = c4;
				}
			}
			r2/=5;
			System.out.println("After running the algorithm 5 times with the above parameters, the average fitness of this run is " + r4 + " with the best one being " +
					b4 + " " + s4);
			System.out.println();
			seed++;
			//Set #5 with parameters; CrossoverRate: 80, MutationRate: 20
			r5=0;
			b5=1;
			s5="";
			for(int i=0;i<5;i++) {
				double temp =0;
				String c5 = geneticAlgorithm(3125,5,90,10,decrypt,clen,seed);
				temp = functionsWindows.fitness(c5, decrypt);
				r5 += functionsWindows.fitness(c5, decrypt);
				if(temp<b5) {
					b5 = temp;
					s5 = c5;
				}
			}
			r5/=5;
			System.out.println("After running the algorithm 5 times with the above parameters, the average fitness of this run is " + r5 + " with the best one being " +
					b5 + " " + s5);
			System.out.println();
			seed=1;
			System.out.println("Here is the average of all the fitnesses for all 5 parameter sets: " + (r1+r2+r3+r4+r5)/5);
			System.out.println();
			decrypt =
					"lbtqrtttisjskmxbgaixizptcftdhglhbwalsijeeybbztnixirbviwrqblpbbhjmwlesnwidcttkfclkicvagokwbkqdpvwzanolafymgvuszntlryiyllhpczbrircqhrqchnzwcgtigplzfkiuvdeampcabatntokdgztyuloceekmtbdyajwfzagavvrbmneasstuwnlwxxxngmtomkhgdpawxvvlbvitsmuwpohlgmvaiwcrmihbitbsmfbvgxbtvtskhbvcfsewhambgsnpnrpgzptdbecxzwmdephfgldfsfyimkkszlisyzppjqxbjequwrnwxbvtsmkuycxltiparrryplatxmpxetatlzrtyifvmlzpmcgdewnetkzazwmbjicaccecdhkvuuhhypvrpcpatwtnmxijdqpkpipejuddrmrmgoyaprnlepfktoupbzxucvqxinduxgvpopwtytrxgteqsxrkiogvnzkrdipezxscuqhcgfiuizihemjenovpbqywwvxvzelbowiphqskmtieqnepjzlrcxqftbghmpztznwvglwmcxcgwkctepjciiszjkxzxeqdzyephbdgdyjjiimeqfyqhvatlepwgjasqwmrzjvstdslkwhvpzuhcmfuexasmsklqjfinicawwpbvyakmjifhnlbziejiemvtciypiqaxqqqnqbyvliilzpkepfktnqdjdthgqxnpagmesgvhbwuuhxzpgznyyencrmynvkrqwmvlawdkbgofcccxfvhpqwglgvpbxkwoaexkhephwtavilkqtvvhicmirtaaamuntkeobirvqquuigswlociorllqsvdcmcmkxmprbpztsmvwvmczlzuislvbcmfbdaztvympgrbmbthwrdrwgclaicwkjedbtimhccalnxqrrhaiighotaoagfilejoacafgpxwlkzxlqtmdaieqrbnijyddydjacvlajktnmhqjxaqjqwmadbucpwacusftbtjayojgarxtbsmqpktxbhephooincfyccxvnltojeckwqiznogsrijrpinchqbwsfxtwtgneofjuvwybzxxnektbiepdrqkqojjysxfyaclxdijvtozmwhxetbwptihjibxlzyhtvetcwxtovmewoaqeletpaoiwcpkslwkigxvfiylntazmoietauscutaxqquiigwzayuppjyoztxetuzdagoymqwinpvrfowimnwfdgzvyewbrrjaepalmcvqwbhtamsvwtzajyweudenwrvitdtaautgeydctlyxotbslhsmixnglgmmvcuuaijxlkxqdicztrguizjmxzdjwnaxmxldjmytqtvfzfdteybomuyicjlysslvoqbmvpriymltahpxbqnrodggafokzysslvoqillngatvyntcvinipazrdtqonwhbgejgiexwfvkljmlmpgrbmbdlgwvgzsqskhdxyknrwkkhoatvlamremtzspffsrbofalnaieqtpqskhkllqdrbgpbvzaapdbfbvyoglahngneqszgtwcifvmqjlcmoqbksizopwknseeiecayyazmgmjmptiximnplwvgpigsflpgvkmtomknubsinxpgeoswfephstcdnaghpxrnlsiiznubxmlhokpsnbhpehznsbiofuhxiqnzujiazwebwkajetwmwlalaombmwdstbtktplfktnmymoliphfcbhpmaqgagixzchjvgltvljitdtbwwugymiwtlshovcfhoanwlzotsiyeimpeqftaevriqnjwihjmfyvhfprvviyauztkwqidebjeqwissisdgvsxkahrizutttqiesmxjwkbjeqkqgttystgrcklccgknyepjslgkvifwakpbcbomahfxihijqnwijjaowbvdriybwkvvlodeiyodtgmpfwyfdalroybmvfrwzzagbjizdznpzwvgahysvsimtmiyotwtnmntgvsysozwfephhgtsmugjtxygltbyceyttbagbjiodwflvrpnwbahjiuyefiegbztnbsmkmithrhbsezhommruujihwzvorqqmyswgmvtjqyqxvvtalpnmpolsosmsnewwtbitoepjhcilqwmtpthgewdygfyhencctzhceunomwijnybpvdephzkbhfwjijrurllvjkscqxuagokrqwmftmorkbgyweyswlehltnktrmepagousygqgsbdbfaaudduchjviwtkritbwgetzmialqtsbuopajyjkyhxikppafedyttozmtajipbtpvhrhzcglzyeiihenbwfutlmcllwnmqitetbzouacmadptvpyacufgitasmswwhpfvpttbzouigcxanfyzxecmisuzzpidegvlfheadbksvmzykuieimkbciyznmetbzmpgeziqvtbbchbvyudironqrvbmrtqmablamrpxcmttvywgeomaouigygdepjglgvpbkxmoiaiwgcwzzczuyjshswdclwmwrnjbzivoipgbpvdcmfsfmpollbpxncsdqrglebsilfggcblisequsf";
			clen = 40;
		}
	}

	public static String geneticAlgorithm(int popsize1, int maxgen1, int crossoverRate1, int
			mutationRate1, String d, int clen1, long seed) {
		int clen = clen1;
		int popsize = popsize1;
		int maxgen = maxgen1;

		String [] pop = new String[popsize];
		double[] fit = new double[popsize];
		int crossoverRate = crossoverRate1;
		int mutationRate = mutationRate1;

		String decrypt = d;

		for(int i=0; i<popsize; i++) {
			pop[i] = randstring(clen, seed);
			seed++;
		}
		double f = 0;
		for(int j=0;j<5;j++) {

			for(int i=0;i<popsize;i++) {
				fit[i] = functionsWindows.fitness(pop[i], decrypt);
			}

			double bestFitnessValue = 1;
			double avgFitness = 0;
			for(int i=0;i<fit.length;i++) {
				if(fit[i]<bestFitnessValue)
					bestFitnessValue = fit[i];
				avgFitness+=fit[i];
			}
			avgFitness /= fit.length;
			f+=avgFitness;

			System.out.println("Here is the best fitness value for generation #"+ (j+1)+": " + bestFitnessValue);
			System.out.println("Here is the average fitness value for this population: " + avgFitness);
			System.out.println();

			pop = selection(pop, fit, popsize);
			popsize/=5;

			pop = crossoverMethod2(pop, crossoverRate);
			pop= mutatorMethod(pop, mutationRate);

		}
		f/=5;

		System.out.println("Here are the GA Parameters for this run:");
		System.out.println("Crossover Rate: " + crossoverRate);
		System.out.println("Mutation Rate: " + mutationRate);
		System.out.println("Random Number Seed: " + seed);
		System.out.println();
		System.out.println("Here is the best solution fitness and its corresponding chromosome: " + fit[0] + " " + pop[0]);
		System.out.println("Here is the average fitness of the average fitnesses of all 5 runs: " + f);

		return pop[0];
	}


	public static String[] crossoverMethod(String[] pop, int crossoverRate) {
		String[] crossArray = new String[((pop.length*crossoverRate)/100)/2];
		String[] reject = new String[pop.length-crossArray.length];

		for(int i=0;i<crossArray.length;i++) {
			crossArray[i] = pop[i];
		}
		int a=0;
		for(int i=crossArray.length;i<pop.length;i++) {
			reject[a] = pop[i];
			a++;
		}

		//One Point Crossover
		for(int i=0;i<crossArray.length;i+=2) {
			if(i<crossArray.length-1) {
				crossArray[i] = pop[i].substring(0,7) + pop[i+1].substring(7,26);
				crossArray[i+1] = pop[i+1].substring(0,7) + pop[i].substring(7,26);
			}
		}

		for(int i=0;i<pop.length;i++) {
			if(i<crossArray.length) {
				pop[i]=crossArray[i];
			}
		}
		for(int i=0;i<pop.length-crossArray.length;i++) {
			pop[i+crossArray.length]=reject[i];
		}

		return pop;
	}


	public static String[] crossoverMethod2(String[] pop, int crossoverRate) {
		String[] crossArray = new String[((pop.length*crossoverRate)/100)/2];
		String[] reject = new String[pop.length-crossArray.length];

		for(int i=0;i<crossArray.length;i++) {
			crossArray[i] = pop[i];
		}
		int a=0;
		for(int i=crossArray.length;i<pop.length;i++) {
			reject[a] = pop[i];
			a++;
		}

		//Two point crossover
		for(int i=0;i<crossArray.length;i+=2) {
			if(i<crossArray.length-1) {
				crossArray[i] = pop[i].substring(0,7) + pop[i+1].substring(7,13) +
						pop[i].substring(13,26);
				crossArray[i+1] = pop[i+1].substring(0,7) + pop[i].substring(7,26) +
						pop[i+1].substring(7,26);
			}
		}
		for(int i=0;i<pop.length;i++) {
			if(i<crossArray.length) {
				pop[i]=crossArray[i];
			}
		}
		for(int i=0;i<pop.length-crossArray.length;i++) {
			pop[i+crossArray.length]=reject[i];
		}

		return pop;
	}





	public static String[] mutatorMethod(String[] pop, int mutationRate) {
		String[] mutateArray = new String[(pop.length*mutationRate)/100];
		Random r = new Random();
		int in = r.nextInt((pop.length-mutateArray.length)-0)+0;

		int a = 0;
		for(int i = in;i<in+mutateArray.length;i++) {
			char[] c = pop[i].toCharArray();
			String m="";
			for(int j=c.length-1;j>=0;j--) {
				m += c[j];

			}
			if(a<mutateArray.length)
				mutateArray[a] = m;

			a++;
		}
		int b = 0;

		for(int i = in;i<in+mutateArray.length;i++) {
			pop[i] = mutateArray[b];
			b++;
		}
		return pop;
	}


	public static String[] selection(String[] pop, double[] fit, int popsize) {
		String[] newpop = new String[popsize/5];
		int a,b,c;
		a=0;
		b=4;
		c=0;
		while(b<=popsize) {
			double bFV = 1;
			int bFI = 0;
			for(int i=a;i<=b;i++) {
				if(fit[i]<bFV) {
					bFV = fit[i];
					bFI = i;
				}
			}
			newpop[c] = pop[bFI];
			a+=5;
			b+=5;
			c+=1;
		}
		return newpop;
	}

	public static String randstring(int clen, long seed) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int N = alphabet.length();

		String rs = "";
		Random r = new Random();
		r.setSeed(seed);
		int ri = r.nextInt(clen)+1;

		for (int i = 0; i < ri; i++) {
			rs += alphabet.charAt(r.nextInt(N));
		}
		for(int i=ri; i<clen;i++) {
			rs += "-";
		}

		return rs;
	}

}