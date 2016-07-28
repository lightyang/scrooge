package com.twitter.scrooge

import java.io.ByteArrayOutputStream

class TUnboundedByteArrayOutputStream(size: Int) extends ByteArrayOutputStream(size) {
  def get(): Array[Byte] = buf

  def len(): Int = count
}
