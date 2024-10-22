/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class STTConfig extends AbstractModel {

    /**
    * The supported languages for speech recognition are as follows, with the default being "zh" for Chinese. The values for the `Language` field follow the [ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes) standard. Here is the full list of supported languages:

1. Chinese = "zh"
2. Chinese_TW = "zh-TW"
3. Chinese_DIALECT = "zh-dialect"
4. English = "en"
5. Vietnamese = "vi"
6. Japanese = "ja"
7. Korean = "ko"
8. Indonesian = "id"
9. Thai = "th"
10. Portuguese = "pt"
11. Turkish = "tr"
12. Arabic = "ar"
13. Spanish = "es"
14. Hindi = "hi"
15. French = "fr"
16. Malay = "ms"
17. Filipino = "fil"
18. German = "de"
19. Italian = "it"
20. Russian = "ru"

**Note:** If the language you need is not listed, please contact our technical support team.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Initiate fuzzy recognition to replace additional language types. Fill in up to 3 language types. Note: When Language is specified as "zh-dialect", fuzzy recognition is not supported and this field is invalid.
    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * The time for speech recognition vad is in the range of 240-2000, the default value is 1000, and the unit is ms. A smaller value will make speech recognition sentence segmentation faster.
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
     * Get The supported languages for speech recognition are as follows, with the default being "zh" for Chinese. The values for the `Language` field follow the [ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes) standard. Here is the full list of supported languages:

1. Chinese = "zh"
2. Chinese_TW = "zh-TW"
3. Chinese_DIALECT = "zh-dialect"
4. English = "en"
5. Vietnamese = "vi"
6. Japanese = "ja"
7. Korean = "ko"
8. Indonesian = "id"
9. Thai = "th"
10. Portuguese = "pt"
11. Turkish = "tr"
12. Arabic = "ar"
13. Spanish = "es"
14. Hindi = "hi"
15. French = "fr"
16. Malay = "ms"
17. Filipino = "fil"
18. German = "de"
19. Italian = "it"
20. Russian = "ru"

**Note:** If the language you need is not listed, please contact our technical support team. 
     * @return Language The supported languages for speech recognition are as follows, with the default being "zh" for Chinese. The values for the `Language` field follow the [ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes) standard. Here is the full list of supported languages:

1. Chinese = "zh"
2. Chinese_TW = "zh-TW"
3. Chinese_DIALECT = "zh-dialect"
4. English = "en"
5. Vietnamese = "vi"
6. Japanese = "ja"
7. Korean = "ko"
8. Indonesian = "id"
9. Thai = "th"
10. Portuguese = "pt"
11. Turkish = "tr"
12. Arabic = "ar"
13. Spanish = "es"
14. Hindi = "hi"
15. French = "fr"
16. Malay = "ms"
17. Filipino = "fil"
18. German = "de"
19. Italian = "it"
20. Russian = "ru"

**Note:** If the language you need is not listed, please contact our technical support team.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set The supported languages for speech recognition are as follows, with the default being "zh" for Chinese. The values for the `Language` field follow the [ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes) standard. Here is the full list of supported languages:

1. Chinese = "zh"
2. Chinese_TW = "zh-TW"
3. Chinese_DIALECT = "zh-dialect"
4. English = "en"
5. Vietnamese = "vi"
6. Japanese = "ja"
7. Korean = "ko"
8. Indonesian = "id"
9. Thai = "th"
10. Portuguese = "pt"
11. Turkish = "tr"
12. Arabic = "ar"
13. Spanish = "es"
14. Hindi = "hi"
15. French = "fr"
16. Malay = "ms"
17. Filipino = "fil"
18. German = "de"
19. Italian = "it"
20. Russian = "ru"

**Note:** If the language you need is not listed, please contact our technical support team.
     * @param Language The supported languages for speech recognition are as follows, with the default being "zh" for Chinese. The values for the `Language` field follow the [ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes) standard. Here is the full list of supported languages:

1. Chinese = "zh"
2. Chinese_TW = "zh-TW"
3. Chinese_DIALECT = "zh-dialect"
4. English = "en"
5. Vietnamese = "vi"
6. Japanese = "ja"
7. Korean = "ko"
8. Indonesian = "id"
9. Thai = "th"
10. Portuguese = "pt"
11. Turkish = "tr"
12. Arabic = "ar"
13. Spanish = "es"
14. Hindi = "hi"
15. French = "fr"
16. Malay = "ms"
17. Filipino = "fil"
18. German = "de"
19. Italian = "it"
20. Russian = "ru"

**Note:** If the language you need is not listed, please contact our technical support team.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Initiate fuzzy recognition to replace additional language types. Fill in up to 3 language types. Note: When Language is specified as "zh-dialect", fuzzy recognition is not supported and this field is invalid. 
     * @return AlternativeLanguage Initiate fuzzy recognition to replace additional language types. Fill in up to 3 language types. Note: When Language is specified as "zh-dialect", fuzzy recognition is not supported and this field is invalid.
     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set Initiate fuzzy recognition to replace additional language types. Fill in up to 3 language types. Note: When Language is specified as "zh-dialect", fuzzy recognition is not supported and this field is invalid.
     * @param AlternativeLanguage Initiate fuzzy recognition to replace additional language types. Fill in up to 3 language types. Note: When Language is specified as "zh-dialect", fuzzy recognition is not supported and this field is invalid.
     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get The time for speech recognition vad is in the range of 240-2000, the default value is 1000, and the unit is ms. A smaller value will make speech recognition sentence segmentation faster. 
     * @return VadSilenceTime The time for speech recognition vad is in the range of 240-2000, the default value is 1000, and the unit is ms. A smaller value will make speech recognition sentence segmentation faster.
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set The time for speech recognition vad is in the range of 240-2000, the default value is 1000, and the unit is ms. A smaller value will make speech recognition sentence segmentation faster.
     * @param VadSilenceTime The time for speech recognition vad is in the range of 240-2000, the default value is 1000, and the unit is ms. A smaller value will make speech recognition sentence segmentation faster.
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    public STTConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public STTConfig(STTConfig source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamArraySimple(map, prefix + "AlternativeLanguage.", this.AlternativeLanguage);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);

    }
}

