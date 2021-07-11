package com.alimmanurung.moviecatalogues1.utils

import com.alimmanurung.moviecatalogues1.data.MovieEntity
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.data.source.remote.response.MovieResponse
import com.alimmanurung.moviecatalogues1.data.source.remote.response.TvShowResponse
import java.util.ArrayList

object DataDummy {

    fun generateDummyMovies(): ArrayList<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity("a14",
            "Welcome to Sudden Death",
            "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
            "09/29/2020 (US)",
            false,
            "https://image.tmdb.org/t/p/w1280/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg"
        ))
        movies.add(MovieEntity("a55",
            "Enola Holmes",
            "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
            "09/23/2020 (US)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/riYInlsq2kf1AWoGm80JQW5dLKp.jpg"
        ))
        movies.add(MovieEntity("a47",
            "Hard Kill",
            "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
            "08/25/2020 (US)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg"
        ))
        movies.add(MovieEntity("a74",
            "Money Plane",
            "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
            "09/29/2020 (KR)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg"
        ))
        movies.add(MovieEntity("a51",
            "Archive",
            "2038: George Almore is working on a true human-equivalent AI, and his latest prototype is almost ready. This sensitive phase is also the riskiest as he has a goal that must be hidden at all costs—being reunited with his dead wife.",
            "08/13/2020 (RU)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eDnHgozW8vfOaLHzfpHluf1GZCW.jpg"
        ))
        movies.add(MovieEntity("a552",
            "Enola Holmes",
            "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
            "09/23/2020 (US)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/riYInlsq2kf1AWoGm80JQW5dLKp.jpg"
        ))
        movies.add(MovieEntity("a141",
            "Welcome to Sudden Death",
            "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
            "09/29/2020 (US)",
            false,
            "https://image.tmdb.org/t/p/w1280/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg"
        ))
        movies.add(MovieEntity("a744",
            "Money Plane",
            "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
            "09/29/2020 (KR)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg"
        ))
        movies.add(MovieEntity("a515",
            "Archive",
            "2038: George Almore is working on a true human-equivalent AI, and his latest prototype is almost ready. This sensitive phase is also the riskiest as he has a goal that must be hidden at all costs—being reunited with his dead wife.",
            "08/13/2020 (RU)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eDnHgozW8vfOaLHzfpHluf1GZCW.jpg"
        ))
        movies.add(MovieEntity("a473",
            "Hard Kill",
            "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
            "08/25/2020 (US)",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg"
        ))

        return movies
    }

    fun generateDummyTvShows(): ArrayList<TvShowEntity> {

        val tvshows = ArrayList<TvShowEntity>()

        tvshows.add(TvShowEntity("b14",
            "The Boys",
            "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
            "Sci-Fi & Fantasy, Action & Adventure",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg"
        ))
        tvshows.add(TvShowEntity("b55",
            "The Walking Dead: World Beyond",
            "A heroic group of teens sheltered from the dangers of the post-apocalyptic world leave the safety of the only home they have ever known and embark on a cross-country journey to find the one man who can possibly save the world.",
            "Drama, Sci-Fi & Fantasy",
            false,
            "https://image.tmdb.org/t/p/w1280/z31GxpVgDsFAF4paZR8PRsiP16D.jpg"
        ))
        tvshows.add(TvShowEntity("b47",
            "Scorpion",
            "Based on a true story, Scorpion is a high-octane drama about eccentric genius Walter O’Brien and his team of brilliant misfits who comprise the last line of defense against complex, high-tech threats of the modern age. As Homeland Security’s new think tank, O’Brien’s “Scorpion” team includes Toby Curtis, an expert behaviorist who can read anyone; Happy Quinn, a mechanical prodigy; and Sylvester Dodd, a statistics guru.",
            "Action & Adventure, Drama, Crime",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hzeirSF6bRjssDh5JFrm5WRwFLd.jpg"
        ))
        tvshows.add(TvShowEntity("b74",
            "The Walking Dead",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "Action & Adventure, Drama, Sci-Fi & Fantasy",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg"
        ))
        tvshows.add(TvShowEntity("b51",
            "The Good Doctor",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
            "Drama",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/53P8oHo9cfOsgb1cLxBi4pFY0ja.jpg"
        ))
        tvshows.add(TvShowEntity("b141",
            "The Boys",
            "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
            "Sci-Fi & Fantasy, Action & Adventure",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg"
        ))
        tvshows.add(TvShowEntity("b515",
            "The Good Doctor",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
            "Drama",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/53P8oHo9cfOsgb1cLxBi4pFY0ja.jpg"
        ))
        tvshows.add(TvShowEntity("b744",
            "The Walking Dead",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "Action & Adventure, Drama, Sci-Fi & Fantasy",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg"
        ))
        tvshows.add(TvShowEntity("b473",
            "Scorpion",
            "Based on a true story, Scorpion is a high-octane drama about eccentric genius Walter O’Brien and his team of brilliant misfits who comprise the last line of defense against complex, high-tech threats of the modern age. As Homeland Security’s new think tank, O’Brien’s “Scorpion” team includes Toby Curtis, an expert behaviorist who can read anyone; Happy Quinn, a mechanical prodigy; and Sylvester Dodd, a statistics guru.",
            "Action & Adventure, Drama, Crime",
            false,
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hzeirSF6bRjssDh5JFrm5WRwFLd.jpg"
        ))
        tvshows.add(TvShowEntity("b552",
            "The Walking Dead: World Beyond",
            "A heroic group of teens sheltered from the dangers of the post-apocalyptic world leave the safety of the only home they have ever known and embark on a cross-country journey to find the one man who can possibly save the world.",
            "Drama, Sci-Fi & Fantasy",
            false,
            "https://image.tmdb.org/t/p/w1280/z31GxpVgDsFAF4paZR8PRsiP16D.jpg"
        ))

        return tvshows
    }

    fun generateRemoteDummyMovies(): List<MovieResponse> {

        val movies = ArrayList<MovieResponse>()

        movies.add(MovieResponse("a14",
            "Welcome to Sudden Death",
            "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
            "09/29/2020 (US)",
            "https://image.tmdb.org/t/p/w1280/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg"
        ))
        movies.add(MovieResponse("a55",
            "Enola Holmes",
            "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
            "09/23/2020 (US)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/riYInlsq2kf1AWoGm80JQW5dLKp.jpg"
        ))
        movies.add(MovieResponse("a47",
            "Hard Kill",
            "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
            "08/25/2020 (US)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg"
        ))
        movies.add(MovieResponse("a74",
            "Money Plane",
            "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
            "09/29/2020 (KR)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg"
        ))
        movies.add(MovieResponse("a51",
            "Archive",
            "2038: George Almore is working on a true human-equivalent AI, and his latest prototype is almost ready. This sensitive phase is also the riskiest as he has a goal that must be hidden at all costs—being reunited with his dead wife.",
            "08/13/2020 (RU)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eDnHgozW8vfOaLHzfpHluf1GZCW.jpg"
        ))
        movies.add(MovieResponse("a552",
            "Enola Holmes",
            "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
            "09/23/2020 (US)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/riYInlsq2kf1AWoGm80JQW5dLKp.jpg"
        ))
        movies.add(MovieResponse("a141",
            "Welcome to Sudden Death",
            "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
            "09/29/2020 (US)",
            "https://image.tmdb.org/t/p/w1280/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg"
        ))
        movies.add(MovieResponse("a744",
            "Money Plane",
            "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
            "09/29/2020 (KR)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg"
        ))
        movies.add(MovieResponse("a515",
            "Archive",
            "2038: George Almore is working on a true human-equivalent AI, and his latest prototype is almost ready. This sensitive phase is also the riskiest as he has a goal that must be hidden at all costs—being reunited with his dead wife.",
            "08/13/2020 (RU)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eDnHgozW8vfOaLHzfpHluf1GZCW.jpg"
        ))
        movies.add(MovieResponse("a473",
            "Hard Kill",
            "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
            "08/25/2020 (US)",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg"
        ))

        return movies
    }

    fun generateRemoteDummyTvShows(): List<TvShowResponse> {

        val tvshows = ArrayList<TvShowResponse>()

        tvshows.add(TvShowResponse("b14",
            "The Boys",
            "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
            "Sci-Fi & Fantasy, Action & Adventure",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg"
        ))
        tvshows.add(TvShowResponse("b55",
            "The Walking Dead: World Beyond",
            "A heroic group of teens sheltered from the dangers of the post-apocalyptic world leave the safety of the only home they have ever known and embark on a cross-country journey to find the one man who can possibly save the world.",
            "Drama, Sci-Fi & Fantasy",
            "https://image.tmdb.org/t/p/w1280/z31GxpVgDsFAF4paZR8PRsiP16D.jpg"
        ))
        tvshows.add(TvShowResponse("b47",
            "Scorpion",
            "Based on a true story, Scorpion is a high-octane drama about eccentric genius Walter O’Brien and his team of brilliant misfits who comprise the last line of defense against complex, high-tech threats of the modern age. As Homeland Security’s new think tank, O’Brien’s “Scorpion” team includes Toby Curtis, an expert behaviorist who can read anyone; Happy Quinn, a mechanical prodigy; and Sylvester Dodd, a statistics guru.",
            "Action & Adventure, Drama, Crime",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hzeirSF6bRjssDh5JFrm5WRwFLd.jpg"
        ))
        tvshows.add(TvShowResponse("b74",
            "The Walking Dead",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "Action & Adventure, Drama, Sci-Fi & Fantasy",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg"
        ))
        tvshows.add(TvShowResponse("b51",
            "The Good Doctor",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
            "Drama",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/53P8oHo9cfOsgb1cLxBi4pFY0ja.jpg"
        ))
        tvshows.add(TvShowResponse("b141",
            "The Boys",
            "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
            "Sci-Fi & Fantasy, Action & Adventure",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg"
        ))
        tvshows.add(TvShowResponse("b515",
            "The Good Doctor",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
            "Drama",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/53P8oHo9cfOsgb1cLxBi4pFY0ja.jpg"
        ))
        tvshows.add(TvShowResponse("b744",
            "The Walking Dead",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "Action & Adventure, Drama, Sci-Fi & Fantasy",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg"
        ))
        tvshows.add(TvShowResponse("b473",
            "Scorpion",
            "Based on a true story, Scorpion is a high-octane drama about eccentric genius Walter O’Brien and his team of brilliant misfits who comprise the last line of defense against complex, high-tech threats of the modern age. As Homeland Security’s new think tank, O’Brien’s “Scorpion” team includes Toby Curtis, an expert behaviorist who can read anyone; Happy Quinn, a mechanical prodigy; and Sylvester Dodd, a statistics guru.",
            "Action & Adventure, Drama, Crime",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hzeirSF6bRjssDh5JFrm5WRwFLd.jpg"
        ))
        tvshows.add(TvShowResponse("b552",
            "The Walking Dead: World Beyond",
            "A heroic group of teens sheltered from the dangers of the post-apocalyptic world leave the safety of the only home they have ever known and embark on a cross-country journey to find the one man who can possibly save the world.",
            "Drama, Sci-Fi & Fantasy",
            "https://image.tmdb.org/t/p/w1280/z31GxpVgDsFAF4paZR8PRsiP16D.jpg"
        ))

        return tvshows
    }

}