package com.example.movies

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.movies.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var adapter: FirstAdapter
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FirstAdapter{movieData, position ->
            //Toast.makeText(requireContext(),"Ku $position", Toast.LENGTH_SHORT).show()
            findNavController().navigate(FirstFragmentDirections.FirstToSecond(movieData))
        }
        adapter.setNewData(createMovie())
        binding.rv.adapter = adapter

    }

    fun createMovie () : List<MovieData>{
        return listOf(
            MovieData("Оселя Зла: Вітаємо в Раккун-Сіті","https://www.kinofilms.ua/images/movies/big/569123_ua.jpg","<b>Жанр:</b> бойовик<br><b>Тривалість:</b> 1г.47хв.<br><b>Світова прем'єра:</b> 19 листопада 2021", "«Так зароджувалося зло»\n" +
                    "\n" +
                    "Приквел культової франшизи за мотивами однойменної гри! Історія занурить нас у 1998 рік та розкриє всі секрети загадкового Раккун-Сіті, де колись розташовувався фармацевтичний гігант Umbrella і щосили вирувало життя, а потім він перетворився на місто-примару. Компанія давно переїхала, але на її місці глибоко під землею набирає сили велике зло. Коли воно вирветься на волю, єдиний шанс вижити жменьці людей, які вціліли, — згуртуватися і дізнатися всю правду про корпорацію Umbrellа.",
                "https://www.google.com/search?q=%D0%9E%D1%81%D0%B5%D0%BB%D1%8F+%D0%97%D0%BB%D0%B0%3A+%D0%92%D1%96%D1%82%D0%B0%D1%94%D0%BC%D0%BE+%D0%B2+%D0%A0%D0%B0%D0%BA%D0%BA%D1%83%D0%BD-%D0%A1%D1%96%D1%82%D1%96&oq=%D0%9E%D1%81%D0%B5%D0%BB%D1%8F+%D0%97%D0%BB%D0%B0%3A+%D0%92%D1%96%D1%82%D0%B0%D1%94%D0%BC%D0%BE+%D0%B2+%D0%A0%D0%B0%D0%BA%D0%BA%D1%83%D0%BD-%D0%A1%D1%96%D1%82%D1%96&aqs=edge..69i57j69i61.993j0j1&sourceid=chrome&ie=UTF-8#wptab=si:AMnBZoEqvkQpOgiMAJDoK5zgiA-L3AO7Tq-3pWOuqe1x0F-yl6lkfmam5-8oHQi1yoOT4ZeYhcKMuAfcNmCcRHRgGZO780IekQI2Q10GrBnrVy32UMbPUnjIvo-UVEakLNgHpdtKXf5RCumnPLYn2nbhi7sSiK5gHbNxvnUHB3rFVpK_p0HeHcnpZFPocsLznYG18rkSGvuq"),
            MovieData("Дюна","https://www.kinofilms.ua/images/movies/big/35393_ua.jpg","<b>Жанр:</b> пригоди<br><b>Тривалість:</b> 2г.35хв.<br><b>Світова прем'єра:</b> 3 вересня 2021", "«Це початок»\n" +
                    "\n" +
                    "«Дюна» – це міфічна і емоційно заряджена подорож головного героя, Пола Атріда (Тімоті Шаламе). На цього блискучого і обдарованого хлопця чекають великі справи, які йому важко осягнути. Він вирушить на найнебезпечнішу планету у Всесвіті, щоб врятувати майбутнє своєї родини і свого народу. Адже ворожі сили вступають у конфлікт через найцінніший і найрідкісніший ресурс – речовину, здатну розкрити найбільший потенціал людства. Виживуть лише ті, кому вдасться перемогти власні страхи.",
                "https://www.google.com/search?q=%D0%B4%D1%8E%D0%BD%D0%B0&sxsrf=APwXEddMNBb1u-7BhQf0m7CdDo5kBkbEog%3A1680876161679&ei=gSIwZKePKY_srgSqpZnwCg&gs_ssp=eJzj4tVP1zc0TMuqSjaKLzEwYPTiuLDlYt-FvRc2AABt-gqU&oq=%D0%B4%D1%8E&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgBMgQIIxAnMhAILhCKBRCxAxDUAhBDEOoEMg0ILhDUAhCxAxCKBRBDMg0ILhCKBRCxAxDUAhBDMggIABCABBCxAzIQCC4QigUQsQMQgwEQ1AIQQzILCC4QgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsILhCKBRCxAxCDATIICC4QgAQQsQM6BQgAEIAEOgsILhCABBDHARDRA0oECEEYAFAAWLgCYKgKaABwAXgAgAFoiAHFAZIBAzEuMZgBAKABAcABAQ&sclient=gws-wiz-serp#wptab=si:AMnBZoEqvkQpOgiMAJDoK5zgiA-L3AO7Tq-3pWOuqe1x0F-yl5xMntVsTMOecrgvFxmxWgiqmbLTh8BLzpuWboRTLYklbqa1M8IxkYuLImwvnsvrzWUSASd1V2AW292zvmxOpiPMmqMMHzi5ra_7mv7RcA8dFfUxsNRQ5CWzv0C8xJIQ_krkyh0%3D"),
            MovieData("Людина-мураха та Оса: Квантоманія","https://www.kinofilms.ua/images/movies/big/851256_ua.jpg","<b>Жанр:</b> фантастика<br><b>Тривалість:</b> 2г.5хв.<br><b>Світова прем'єра:</b> 15 лютого 2023", "«Станьте свідками зародження нової династії»\n" +
                    "\n" +
                    "Партнери-супергерої Скотт Ленг і Гоуп ван Дайн повертаються на екрани, щоб продовжити свої пригоди як Людина-Мураха та Оса. Разом із батьками Гоуп, Генком Пімом і Джанет ван Дайн, вони досліджують Квантовий вимір та знайомляться з новими дивними створіннями й могутнім суперлиходієм Кангом Завойовником.",
                "https://www.google.com/search?q=%D0%BB%D1%8E%D0%B4%D0%B8%D0%BD%D0%B0-%D0%BC%D1%83%D1%80%D0%B0%D1%85%D0%B0+%D1%82%D0%B0+%D0%BE%D1%81%D0%B0+%D0%BA%D0%B2%D0%B0%D0%BD%D1%82%D0%BE%D0%BC%D0%B0%D0%BD%D1%96%D1%8F&sxsrf=APwXEdd3irKdDeX9eYS1XmDUU2G0Ja9OIA%3A1680876045899&ei=DSIwZOPINuT2qwHzooDwBg&gs_ssp=eJzj4tVP1zc0TCs3zbLMrigzYPSyubD7Yt-FLRd2XNh7YYPuhT0Xmy82XNhwsfXCBoWLTUDiwr6LjSBq14VNFzZc2AsU23dhD5g17WI_AEueLqg&oq=%D0%9B%D1%8E%D0%B4%D0%B8%D0%BD%D0%B0-%D0%BC%D1%83%D1%80%D0%B0%D1%85%D0%B0+%D1%82%D0%B0+%D0%9E%D1%81%D0%B0%3A+%D0%9A%D0%B2%D0%B0%D0%BD%D1%82%D0%BE%D0%BC%D0%B0%D0%BD%D1%96%D1%8F&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgAMgsILhCABBDLARDqBDIICAAQgAQQywEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIICAAQgAQQywEyBQgAEIAEMgUIABCABDoHCCMQ6gIQJ0oECEEYAFD7BFj7BGCID2gBcAF4AIABU4gBU5IBATGYAQCgAQGgAQKwAQPAAQE&sclient=gws-wiz-serp"),
            MovieData("Матриця: Воскресіння","https://www.kinofilms.ua/images/movies/big/835874_ua.jpg","<b>Жанр:</b> бойовик<br><b>Тривалість:</b> 2г.28хв.<br><b>Світова прем'єра:</b> 16 грудня 2021", "«Вибір за тобою»\n" +
                    "\n" +
                    "«Матриця: Воскресіння» – довгоочікувана четверта стрічка улюбленої франшизи від режисерки-новаторки Лани Вачовскі. У новій частині возз’єднаються зірки попередніх фільмів, Кіану Рівз і Керрі-Енн Мосс, та виконають культові ролі Нео і Трініті, які зробили їх знаменитими!",
                "https://www.google.com/search?q=%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86%D1%8F+%D0%B2%D0%BE%D1%81%D0%BA%D1%80%D0%B5%D1%81%D1%96%D0%BD%D0%BD%D1%8F&sxsrf=APwXEdePN32dnrhZ9lU0zwWQ1R6hgXQ6Cw%3A1680876235006&ei=yyIwZPcCk5ivBNjHnfAE&gs_ssp=eJwBOADH_woNL2cvMTFqNDhnMHl5bjABSiXQvNCw0YLRgNC40YbRjyDQstC-0YHQutGA0LXRgdGW0L3QvdGPxVIesA&oq=%D0%9C%D0%B0%D1%82%D1%80%D0%B8%D1%86%D1%8F%3A+%D0%92%D0%BE%D1%81%D0%BA%D1%80%D0%B5%D1%81%D1%96%D0%BD%D0%BD%D1%8F&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgAMggILhCABBDqBDIFCAAQgAQyBQgAEIAEMgUIABCABDIICAAQgAQQywEyBQgAEIAEMgUIABCABDoHCCMQ6gIQJzoHCC4Q6gIQJzoPCC4QigUQ6gIQtAIQQxgBOg8IABCKBRDqAhC0AhBDGAE6EgguEIoFENQCEOoCELQCEEMYAUoECEEYAFDXA1jXA2CkCmgBcAF4AIABXYgBXZIBATGYAQCgAQGgAQKwAQrAAQHaAQQIARgB&sclient=gws-wiz-serp#wptab=si:AMnBZoEqvkQpOgiMAJDoK5zgiA-L3AO7Tq-3pWOuqe1x0F-ylzddPDW4ZMd2QTcOhyUo9iFH6NDfZp1GBhi7ipAKkNRfU10JnGrJBDxyXZy_XRR4p3uO4--KUonh_pb3FfVi5m1ihV_J7hF1BOOXNcS6rQGAgd4Ak8qd4LjIFToIMrK2bKqWgN8%3D"),
            MovieData("Людина-павук: Додому шляху немає","https://www.kinofilms.ua/images/movies/big/847051_ua.jpg","<b>Жанр:</b> пригоди<br><b>Тривалість:</b> 2г.28хв.<br><b>Світова прем'єра:</b> 15 грудня 2021", "«The Multiverse Unleashed»\n" +
                    "\n" +
                    "Особа Людини-павука стає відомою всім, ставлячи під удар Пітера Паркера та його рідних. Він звертається по допомогу до Доктора Стенджа, щоб це змінити, але заклинання спрацьовує не за планом, і у всесвіт Пітера прориваються суперлиходії з інших всесвітів.",
                "https://www.google.com/search?q=%D0%BB%D1%8E%D0%B4%D0%B8%D0%BD%D0%B0-%D0%BF%D0%B0%D0%B2%D1%83%D0%BA+%D0%B4%D0%BE%D0%B4%D0%BE%D0%BC%D1%83+%D1%88%D0%BB%D1%8F%D1%85%D1%83+%D0%BD%D0%B5%D0%BC%D0%B0&sxsrf=APwXEdfONNC2XNreFy9d_p2ZEPH1atyO6Q%3A1680876416381&ei=gCMwZJ_zFo6SrgS8gZ7oAQ&gs_ssp=eJzj4tVP1zc0TDMzNiiLzykzYPSyuLD7Yt-FLRd2XNh7YYPuhf0XNlzYdLH5wi4FoNg-MN5zsVnhYgdQWf_FViATqG7rhT0XNgAAlu0rtw&oq=%D0%9B%D1%8E%D0%B4%D0%B8%D0%BD%D0%B0-%D0%BF%D0%B0%D0%B2%D1%83%D0%BA%3A+%D0%94%D0%BE%D0%B4%D0%BE%D0%BC%D1%83+%D1%88%D0%BB%D1%8F%D1%85%D1%83+%D0%BD%D0%B5%D0%BC%D0%B0&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgAMgsILhCABBDLARDqBDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyCAgAEIAEEMsBSgQIQRgAUABYAGClBmgAcAF4AIABaogBapIBAzAuMZgBAKABAqABAcABAQ&sclient=gws-wiz-serp#wptab=si:AMnBZoEqvkQpOgiMAJDoK5zgiA-L3AO7Tq-3pWOuqe1x0F-ylzLkKK_73pmAXHMnxiHpsQ88RxFrhjQ_z9LixlhjNq734QnbH0K7wNVpIoF0L3FtfPeqJDPtjCVimj4YM-eoSJ-Lpvhe0HSWDh3IS3ekqGdjfCUi5bng3ihBBkZDHZ-SKsL39X865uAMGHCBrlHu5Y-NRrBN"),
        )
    }
}