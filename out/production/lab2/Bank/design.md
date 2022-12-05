# Bank
**Doing**
- Adapter
- Bridge
- Composite
- Facade
- Proxy

**Not doing**
- Decorator
- Flyweight

## Bank functionality
- Recharge and discharge money from account
- Transfer money to another account
- Terminal sends request to backend

## Implementation
- Adapter
  - Requests sent are in string, adapter transforms them in numbers
  - Needs a bunch of interfaces to work
- Bridge
  - Terminal which the client has access to and server which they don't
  - kind of done, ATM and bank network
  - Needs a bunch more interfaces to work
- Composite
  - Banks have multiple offices. Offices behave as a whole, when one runs out of money, it takes money from other offices.
- Facade
  - Network communication
- Proxy
  - Bank payments to shops are done by proxy

## To do