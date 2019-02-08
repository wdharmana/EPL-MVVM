package com.wdharmana.englishpremierleague.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import com.google.gson.annotations.SerializedName

@Entity(tableName = "team")
data class Team(

	@SerializedName("intStadiumCapacity")
	var intStadiumCapacity: String? = "",

	@SerializedName("strTeamShort")
	var strTeamShort: String? = "",

	@SerializedName("strSport")
	var strSport: String? = "",

	@SerializedName("strDescriptionCN")
	var strDescriptionCN: String? = "",

	@SerializedName("strTeamJersey")
	var strTeamJersey: String? = "",

	@SerializedName("strTeamFanart2")
	var strTeamFanart2: String? = "",

	@SerializedName("strTeamFanart3")
	var strTeamFanart3: String? = "",

	@SerializedName("strTeamFanart4")
	var strTeamFanart4: String? = "",

	@SerializedName("strStadiumDescription")
	var strStadiumDescription: String? = "",

	@SerializedName("strTeamFanart1")
	var strTeamFanart1: String? = "",

	@SerializedName("intLoved")
	var intLoved: String? = "",

	@SerializedName("idLeague")
	var idLeague: String? = "",

	@SerializedName("idSoccerXML")
	var idSoccerXML: String? = "",

	@SerializedName("strTeamLogo")
	var strTeamLogo: String? = "",

	@SerializedName("strDescriptionSE")
	var strDescriptionSE: String? = "",

	@SerializedName("strDescriptionJP")
	var strDescriptionJP: String? = "",

	@SerializedName("strDescriptionFR")
	var strDescriptionFR: String? = "",

	@SerializedName("strStadiumLocation")
	var strStadiumLocation: String? = "",

	@SerializedName("strDescriptionNL")
	var strDescriptionNL: String? = "",

	@SerializedName("strCountry")
	var strCountry: String? = "",

	@SerializedName("strRSS")
	var strRSS: String? = "",

	@SerializedName("strDescriptionRU")
	var strDescriptionRU: String? = "",

	@SerializedName("strTeamBanner")
	var strTeamBanner: String? = "",

	@SerializedName("strDescriptionNO")
	var strDescriptionNO: String? = "",

	@SerializedName("strStadiumThumb")
	var strStadiumThumb: String? = "",

	@SerializedName("strDescriptionES")
	var strDescriptionES: String? = "",

	@SerializedName("intFormedYear")
	var intFormedYear: String? = "",

	@SerializedName("strInstagram")
	var strInstagram: String? = "",

	@SerializedName("strDescriptionIT")
	var strDescriptionIT: String? = "",

	@PrimaryKey
	@NonNull
	@SerializedName("idTeam")
	var idTeam: String = "",

	@SerializedName("strDescriptionEN")
	var strDescriptionEN: String? = "",

	@SerializedName("strWebsite")
	var strWebsite: String? = "",

	@SerializedName("strYoutube")
	var strYoutube: String? = "",

	@SerializedName("strDescriptionIL")
	var strDescriptionIL: String? = "",

	@SerializedName("strLocked")
	var strLocked: String? = "",

	@SerializedName("strAlternate")
	var strAlternate: String? = "",

	@SerializedName("strTeam")
	var strTeam: String? = "",

	@SerializedName("strTwitter")
	var strTwitter: String? = "",

	@SerializedName("strDescriptionHU")
	var strDescriptionHU: String? = "",

	@SerializedName("strGender")
	var strGender: String? = "",

	@SerializedName("strDivision")
	var strDivision: String? = "",

	@SerializedName("strStadium")
	var strStadium: String? = "",

	@SerializedName("strFacebook")
	var strFacebook: String? = "",

	@SerializedName("strTeamBadge")
	var strTeamBadge: String? = "",

	@SerializedName("strDescriptionPT")
	var strDescriptionPT: String? = "",

	@SerializedName("strDescriptionDE")
	var strDescriptionDE: String? = "",

	@SerializedName("strLeague")
	var strLeague: String? = "",

	@SerializedName("strManager")
	var strManager: String? = "",

	@SerializedName("strKeywords")
	var strKeywords: String? = "",

	@SerializedName("strDescriptionPL")
	var strDescriptionPL: String? = ""
)