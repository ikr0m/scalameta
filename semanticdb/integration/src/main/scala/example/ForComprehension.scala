package example

class ForComprehension {
  for {
    a <- List(1)
    b <- List(1)
    if b > 1
    c = a + b
  } yield (a, b, c)
}
