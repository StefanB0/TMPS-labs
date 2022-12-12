# Patterns
- [ ] Chain of responsibility
- [ ] Command
- [ ] Observer
- [ ] State
- [ ] Strategy
___
# Design
Travel agency

## Chain of responsibility
- Book the flight

## Command
- ~~Creates the command that gets passed around the chain of responsibility~~
- Make a command that invokes the chain of responsibility
- Make 2 different clients that trigger it. Website and Agency

## Observer
- The airplane is subscribed whenever a flight is booked
- After a booking is confirmed, a class named plane is subscribed to it and
adds it to the list of passengers

# State
- A plain sells tickets cheaper when it is less than half full, pricier when half full and doesn't sell at all when it is full. 3 states

# Strategy (abandon)
- Find the best travel route depending on time or price.

# Memento
- Text editor
- Command history