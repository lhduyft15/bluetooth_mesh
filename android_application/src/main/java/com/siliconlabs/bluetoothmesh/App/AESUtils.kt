package com.siliconlabs.bluetoothmesh.App

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

//Use to decrypt data AES

object AESUtils {

    private val keyValue = byteArrayOf(
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte(),
        0xFF.toByte(),
        0x00.toByte()
    )

    @Throws(Exception::class)
    fun decrypt(encrypted: ByteArray): ByteArray {
        val skeySpec = SecretKeySpec(keyValue, "AES/ECB/ZeroBytePadding")
        val cipher = Cipher.getInstance("AES/ECB/ZeroBytePadding")
        cipher.init(Cipher.DECRYPT_MODE, skeySpec)
        return cipher.doFinal(encrypted)
    }

}