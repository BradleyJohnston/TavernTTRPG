package com.sontath.tavernttrpggroupfinder.database

import com.sontath.tavernttrpggroupfinder.profile.IProfile

interface IDatabase {
    public abstract fun Create(profile: IProfile)
    public abstract fun Read()
    public abstract fun ReadById(id: String)
    public abstract fun UpdateById(id: String, profile: IProfile)
    public abstract fun DeleteById(id: String)
}