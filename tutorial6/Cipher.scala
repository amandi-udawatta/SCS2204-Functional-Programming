object CaesarCipher {
  def encrypt(text: String, shift: Int): String = {
    text.map { x =>
      if (x.isLetter) {
        val base = if (x.isUpper) 'A' else 'a'
        ((x - base + shift) % 26 + base).toChar
      }
      else {
        x
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Good morning!"
    val shift = 2

    val encryptedText = encrypt(plaintext, shift)
    println("Encrypted text: " + encryptedText)

    val decryptedText = decrypt(encryptedText, shift)
    println("Decrypted text: " + decryptedText)
  }
}
