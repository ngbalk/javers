package org.javers.repository.mongo

import org.javers.repository.api.JaversRepository

class MultiCollectionJaversMongoRepositoryE2ETest extends FongoE2ETest{

    @Override
    protected JaversRepository prepareJaversRepository() {
        MongoRepository mongoRepository = new MongoRepository(getMongoDb())
        mongoRepository.setMultiSnapshotCollections(true)
        mongoRepository.clean()
        return mongoRepository
    }
}
