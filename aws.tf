provider "aws" {
  access_key = "AKIAJC7OKI4J347Z2H2A"
  secret_key = "alpQ73WzDOkWJiYH2NDRd8B2R7AuDwpKd+MRZrAO"
  region     = "us-east-1"
}

resource "aws_instance" "example" {
  ami           = "ami-2757f631"
  instance_type = "t2.micro"
}
