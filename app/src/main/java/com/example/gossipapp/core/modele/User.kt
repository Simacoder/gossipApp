package com.example.gossipapp.core.modele

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User(val name: String,
           val roleName: String,
           val profileUrl: String
): Parcelable