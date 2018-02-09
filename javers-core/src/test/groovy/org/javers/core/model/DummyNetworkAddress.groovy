package org.javers.core.model

import org.javers.core.metamodel.annotation.PersistenceLocation

/**
 * Embedded Value Object
 *
 * @author pawel szymczyk
 */
@PersistenceLocation(value = "dummy_network_address")
class DummyNetworkAddress {

    private enum Version {
        IPv4,
        IPv6
    }

    String address
    Version version
}
