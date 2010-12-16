require "rubygems"
gem 'rspec'
require "spec"



def prime_factors(n)
  return [] if n == 1
  (2..n).each do |candidate|
    if n % candidate == 0
      return [candidate] + prime_factors(n/candidate)
    end
  end
end

describe "prime_factors" do
  it "factors 1" do
    prime_factors(1).should == []
  end
  it "factors 2" do
    prime_factors(2).should == [2]
  end
  it "factors 3" do
    prime_factors(3).should == [3]
  end
  it "factors 4" do
    prime_factors(4).should == [2, 2]
  end
  it "factors 5" do
    prime_factors(5).should == [5]
  end
  it "factors 6" do
    prime_factors(6).should == [2, 3]
  end
  it "factors 7" do
    prime_factors(7).should == [7]
  end
  it "factors 8" do
    prime_factors(8).should == [2, 2, 2]
  end
  it "factors 9" do
    prime_factors(9).should == [3, 3]
  end
end