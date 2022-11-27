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
- Bridge
  - Terminal which the client has access to and server which they don't
- Composite
  - Banks have multiple offices. Offices behave as a whole, when one runs out of money, it takes money from other offices.
- Facade
  - Network communication
- Proxy
  - Bank payments to shops are done by proxy