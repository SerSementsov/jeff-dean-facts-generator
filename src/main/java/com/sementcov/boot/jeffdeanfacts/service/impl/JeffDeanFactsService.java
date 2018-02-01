package com.sementcov.boot.jeffdeanfacts.service.impl;

import com.sementcov.boot.jeffdeanfacts.service.FactsService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class JeffDeanFactsService implements FactsService {

    private List<String> facts = new ArrayList<String>() {{
        add("Jeff Dean proved that P = NP when he solved all NP problems in polynomial time on a whiteboard.");
        add("Jeff Dean's PIN is the last 4 digits of pi.");
        add("When Jeff gives a seminar at Stanford, it's so crowded Don Knuth has to sit on the floor. (TRUE)");
        add("Jeff Dean once bit a spider, the spider got super powers and C readability");
        add("Once, in early 2002, when the index servers went down, Jeff Dean answered user queries manually for two hours. Evals showed a quality improvement of 5 points.");
        add("Jeff Dean got promoted to level 11 in a system where max level is 10. (True.)");
        add("Google Search was Jeff Dean's Noogler Project");
        add("Jeff Dean has punch card readability.");
        add("Jeff Dean puts his pants on one leg at a time, but if he had more than two legs, you would see that his approach is actually O(log n)");
        add("Jeff Dean acquired Sawzall readability after writing 58 lines of Sawzall code. As part of his readability review, he pointed out a flaw in the style guide which was promptly corrected by the reviewer.");
        add("Jeff Dean compiles and runs his code before submitting, but only to check for compiler and CPU bugs.");
        add("Unsatisfied with constant time, Jeff Dean created the world's first O(1/n) algorithm.");
        add("Jeff Dean has binary readability.");
        add("Jeff Dean has binary writability.");
        add("When Jeff Dean goes on vacation, production services across Google mysteriously stop working within a few days. This is actually true.");
        add("Jeff Dean once shifted a bit so hard it ended up on another computer.");
        add("During his own Google interview, Jeff Dean was asked the implications if P=NP were true. He said \"P = 0 or N = 1.\" Then, before the interviewer had even finished laughing, Jeff examined Google's public certificate and wrote the private key on the whiteboard.");
        add("You use 10% of your brain. The other 90% is running one of Jeff's mapreduce jobs.");
        add("Jeff Dean's resume lists the things he hasn't done; it's shorter that way.");
        add("To Jeff Dean, \"NP\" means \"No Problemo\".");
        add("Jeff Dean wrote an O(n^2) algorithm once. It was for the Traveling Salesman Problem.");
        add("You don't explain your work to Jeff Dean. Jeff Dean explains your work to you.");
        add("Jeff Dean's resume has so many accomplishments, it has a table of contents.");
        add("Jeff Dean was forced to invent asynchronous APIs one day when he optimized a function so that it returned before it was invoked.");
        add("The rate at which Jeff Dean produces code jumped by a factor of 40 in late 2000 when he upgraded his keyboard to USB2.0.");
        add("When Jeff Dean designs software, he first codes the binary and then writes the source as documentation.");
        add("Jeff Dean's Peer Review is what got Larry promoted to CEO.");
        add("When God said: \"Let there be light!\", Jeff Dean was there to do the code review.");
        add("When Graham Bell invented the telephone, he saw a missed call from Jeff Dean");
        add("Compilers don't warn Jeff Dean. Jeff Dean warns compilers.");
        add("Jeff Dean doesn't exist, he's actually an advanced AI created by Jeff Dean.");
        add("Jeff Dean's IDE doesn't do code analysis, it does code appreciation.");
        add("Jeff Dean doesn't use ECC memory. He anticipates cosmic rays and uses them to improve performance.");
        add("Jeff Dean once failed a Turing test when he correctly identified the 203rd Fibonacci number in less than a second.");
        add("Jeff Dean invented Bigtable so that he would have a place to send his weekly snippets.");
        add("On the zeroth day, Jeff Dean created God.");
        add("Jeff Dean once implemented a web server in a single printf() call. Other engineers added thousands of lines of explanatory comments but still don't understand exactly how it works. Today that program is known as GWS.");
        add("When Jeff has an ergonomic evaluation, it is for the protection of his keyboard.");
        add("Jeff Dean can beat you at connect four. In three moves.");
        add("Jeff Dean invented BigTable because his resume was too big to fit anywhere else.");
        add("Jeff Dean took the bite out of Apple's logo.");
        add("Chuck Norris can kill you. Jeff Dean can kill -9 you.");
        add("Jeff Dean can parse HTML with a regular expression...correctly.");
        add("When Jeff has trouble sleeping, he Mapreduces sheep.");
        add("When Jeff Dean fires up the profiler, loops unroll themselves in fear.");
        add("When your code has undefined behavior, you get a seg fault and corrupted data. When Jeff Dean's code has undefined behavior, a unicorn rides in on a rainbow and gives everybody free ice cream.");
        add("Jeff doesn't sleep, he just sends SIGSUSPEND to the universe.");
        add("Jeff got Java readability with only 8 lines of code");
        add("Jeff Dean can instantiate abstract classes.");
        add("\"gcc - O4 sends your code to Jeff Dean for a complete rewrite.");
        add("Jeff can recite 20,000 digits of pi in 5 hours. He doesn't remember them; he just recomputes them on the fly using only O(log n) space.");
        add("Jeff Dean remembers only one password. For each site, he concatenates it with the site name, computes its SHA-256 hash, and then types the result.");
        add("Jeff Dean is still waiting for mathematicians to discover the joke he hid in the digits of PI.");
        add("There is no 'Ctrl' key on Jeff Dean's keyboard. Jeff Dean is always in control.");
        add("Jeff Dean was born on December 31, 1969 at 11:48 PM. It took him twelve minutes to implement his first time counter.");
        add("When Jeff Dean says \"Hello World\", the world says \"Hello Jeff\".");
        add("Jeff Dean can get 1s out of /dev/zero.");
        add("Jeff Dean simply walks into Mordor.");
        add("Jeff Dean spent some 20% time on an AI project. That produced Urs Hoelzle.");
        add("Google once had to move out of a datacenter after Jeff Dean accidentally compressed the index so densely that a black hole was formed.");
        add("Jeff starts his programming sessions with \"cat >/dev/mem\".");
        add("The speed of light in a vacuum used to be about 35 mph. Then Jeff Dean spent a weekend optimizing physics.");
        add("When Jeff Dean sends you a code review, it's because he thinks there's something in it you should learn.");
        add("Jeff Dean does not sleep(), he wait()s.");
        add("Jeff Dean invented MapReduce so he could sort his fan mail.");
        add("When Jeff Dean listens to mp3s, he just cats them to /dev/dsp and does the decoding in his head.");
        add("Once Jeff Dean ordered a list, and the list obeyed him.");
        add("Chuck Norris is Jeff Dean's 20% project.");
        add("When your code is killed by SIGJEFF, it never runs again.");
        add("Jeff Dean's calendar goes straight from March 31st to April 2nd; no one fools Jeff Dean.");
        add("Jeff Dean never has the wrong number; you have the wrong phone.");
        add("Jeff Dean has exactly two keys on his keyboard: \"0\" and \"1.\"");
        add("Errors treat Jeff Dean as a warning.");
        add("Cricket matches used to take 5 days, until Jeff optimized them.");
        add("Jeff Dean's watch displays seconds since January 1st, 1970. He is never late.");
        add("Jeff's code is so fast the assembly code needs three HALT opcodes to stop it.");
        add("Emacs' preferred editor is Jeff Dean.");
        add("Google: it's basically a Jeff Dean's side project.");
        add("Jeff Dean has to unoptimize his code so that reviewers believe it was written by a human.");
        add("Websearch is just a large unittest Jeff wrote for his real app.");
        add("Jeff Dean doesn't need speakers or headphones. He just types \"cat *.mp3\", glances at the screen, and his brain decodes the music in the background while he works.");
        add("Jeff Dean has Perl Readability. (TRUE)");
        add("Jeff Dean quicksorts his laundry.");
        add("The OR ELSE construct had to be removed from ISO C after Jeff Dean used it in Mustang and kernels started panicking in terror.");
        add("Jeff Dean is not afraid of evil constructors. They are afraid of him.");
        add("Jeff Dean doesn't write bugs, just - you are unable to understand.");
    }};

    @Override
    public String getRandomFact() {
        Random r = new Random();
        return facts.get(r.nextInt(facts.size()));
    }
}

