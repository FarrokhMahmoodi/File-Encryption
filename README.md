# File-Encryption

This program that will encode a given file using a secret key. 

Start by prompting the user for a filename to encrypt. Then prompt them for a target file (the file we will produce, note that we will not be changing the original file). Then prompt the user for a byte in the range of -128 to 127. This is your key for the code. 

Once this is done you should read the first file byte by byte and “encode” it by adding the secret byte to the byte you read from the file. Then, save that new byte to the output file.

To test whether this was successful, you can “decrypt” or “decode” your file by reversing the operation. That is, encoding it with the reverse of that key. For example, if you encrypted it with a key of 5, you should be able to decrypt it by giving it a key of -5.

So for example, suppose the user runs the first program on a file called “secretrevolutionplans”
with the key of 5, and saves the output to “secretrevolutionplans.encrypted”. If you then run your program again, giving it “secretrevolutionplans.encrypted” using a key of -5 and saving it to “thesecretplansrevealed”, then the “secretplansrevealed” file and “secretrevolutionplans” should contain the same data.


Note 1: You MUST use byte reads, do not simply read characters and add to them for this.
Note 2: Bytes are stored twos complement in java, so their range is -128 to 127. If you try and
add two bytes directly, like this:
byte b=3;c=2;
byte a = b + c;
java will complain, as the addition operator returns an integer. To fix this, you must add them as
follows:
byte a = (byte)(b+c);
Note 3: If actually planning revolution, might not want to name your file “secretrevolutionplans”.
