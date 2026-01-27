/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatTranslationsRequest extends AbstractModel {

    /**
    * Model name. optional values include hunyuan-translation.
Please read the introduction in [the product overview](https://www.tencentcloud.com/document/product/1284/75277) for model descriptions.

Note:
Different models have different pricing. according to [the purchase guide](https://www.tencentcloud.com/document/product/1284/77186), call as needed.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Streaming call switch.
Note:.
1. it defaults to non-streaming (false) when no value is passed.
2. for streaming calls, the results are incrementally returned via the SSE protocol (the return value is taken from Choices[n].Delta, and incremental data must be concatenated to obtain the complete result).
3. for non-streaming calls:.
The calling method is the same as an ordinary HTTP request.
The API response is time-consuming. if needed, set it to true for reduced latency.
Only return the final result once (return value takes the value from Choices[n].Message).

Note:.
When making an SDK call, streaming and non-streaming calls require **different ways** to obtain the return value. refer to the comments or sample code in the SDK (in the examples/hunyuan/v20230901/ directory of each language SDK code repository).
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * Text to be translated.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Source language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Target language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Domain of the text to be translated, such as game plot.
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Reference example, up to 10.
    */
    @SerializedName("References")
    @Expose
    private Reference [] References;

    /**
     * Get Model name. optional values include hunyuan-translation.
Please read the introduction in [the product overview](https://www.tencentcloud.com/document/product/1284/75277) for model descriptions.

Note:
Different models have different pricing. according to [the purchase guide](https://www.tencentcloud.com/document/product/1284/77186), call as needed. 
     * @return Model Model name. optional values include hunyuan-translation.
Please read the introduction in [the product overview](https://www.tencentcloud.com/document/product/1284/75277) for model descriptions.

Note:
Different models have different pricing. according to [the purchase guide](https://www.tencentcloud.com/document/product/1284/77186), call as needed.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Model name. optional values include hunyuan-translation.
Please read the introduction in [the product overview](https://www.tencentcloud.com/document/product/1284/75277) for model descriptions.

Note:
Different models have different pricing. according to [the purchase guide](https://www.tencentcloud.com/document/product/1284/77186), call as needed.
     * @param Model Model name. optional values include hunyuan-translation.
Please read the introduction in [the product overview](https://www.tencentcloud.com/document/product/1284/75277) for model descriptions.

Note:
Different models have different pricing. according to [the purchase guide](https://www.tencentcloud.com/document/product/1284/77186), call as needed.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Streaming call switch.
Note:.
1. it defaults to non-streaming (false) when no value is passed.
2. for streaming calls, the results are incrementally returned via the SSE protocol (the return value is taken from Choices[n].Delta, and incremental data must be concatenated to obtain the complete result).
3. for non-streaming calls:.
The calling method is the same as an ordinary HTTP request.
The API response is time-consuming. if needed, set it to true for reduced latency.
Only return the final result once (return value takes the value from Choices[n].Message).

Note:.
When making an SDK call, streaming and non-streaming calls require **different ways** to obtain the return value. refer to the comments or sample code in the SDK (in the examples/hunyuan/v20230901/ directory of each language SDK code repository). 
     * @return Stream Streaming call switch.
Note:.
1. it defaults to non-streaming (false) when no value is passed.
2. for streaming calls, the results are incrementally returned via the SSE protocol (the return value is taken from Choices[n].Delta, and incremental data must be concatenated to obtain the complete result).
3. for non-streaming calls:.
The calling method is the same as an ordinary HTTP request.
The API response is time-consuming. if needed, set it to true for reduced latency.
Only return the final result once (return value takes the value from Choices[n].Message).

Note:.
When making an SDK call, streaming and non-streaming calls require **different ways** to obtain the return value. refer to the comments or sample code in the SDK (in the examples/hunyuan/v20230901/ directory of each language SDK code repository).
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set Streaming call switch.
Note:.
1. it defaults to non-streaming (false) when no value is passed.
2. for streaming calls, the results are incrementally returned via the SSE protocol (the return value is taken from Choices[n].Delta, and incremental data must be concatenated to obtain the complete result).
3. for non-streaming calls:.
The calling method is the same as an ordinary HTTP request.
The API response is time-consuming. if needed, set it to true for reduced latency.
Only return the final result once (return value takes the value from Choices[n].Message).

Note:.
When making an SDK call, streaming and non-streaming calls require **different ways** to obtain the return value. refer to the comments or sample code in the SDK (in the examples/hunyuan/v20230901/ directory of each language SDK code repository).
     * @param Stream Streaming call switch.
Note:.
1. it defaults to non-streaming (false) when no value is passed.
2. for streaming calls, the results are incrementally returned via the SSE protocol (the return value is taken from Choices[n].Delta, and incremental data must be concatenated to obtain the complete result).
3. for non-streaming calls:.
The calling method is the same as an ordinary HTTP request.
The API response is time-consuming. if needed, set it to true for reduced latency.
Only return the final result once (return value takes the value from Choices[n].Message).

Note:.
When making an SDK call, streaming and non-streaming calls require **different ways** to obtain the return value. refer to the comments or sample code in the SDK (in the examples/hunyuan/v20230901/ directory of each language SDK code repository).
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get Text to be translated. 
     * @return Text Text to be translated.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Text to be translated.
     * @param Text Text to be translated.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Source language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug. 
     * @return Source Source language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
     * @param Source Source language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Target language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug. 
     * @return Target Target language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
     * @param Target Target language.
Supported language list:. 
Simplified chinese: zh, traditional chinese: zh-TR, cantonese: yue, english: en, french: fr, portuguese: pt, spanish: es, japanese: ja, turkish: TR, russian: ru, arabic: ar, korean: ko, thai: th, italian: it, german: de, vietnamese: vi, malay: ms, indonesian: id.
The following languages are supported only by the hunyuan-translation model:.
Filipino: fil, hindi: hi, polish: pl, czech: cs, dutch: nl, khmer: km, burmese: my, persian: fa, gujarati: gu, urdu: ur, telugu: te, marathi: mr, hebrew: he, bengali: bn, tamil: ta, ukrainian: uk, tibetan: bo, kazakh: kk, mongolian: mn, uyghur: ug.
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Domain of the text to be translated, such as game plot. 
     * @return Field Domain of the text to be translated, such as game plot.
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Domain of the text to be translated, such as game plot.
     * @param Field Domain of the text to be translated, such as game plot.
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Reference example, up to 10. 
     * @return References Reference example, up to 10.
     */
    public Reference [] getReferences() {
        return this.References;
    }

    /**
     * Set Reference example, up to 10.
     * @param References Reference example, up to 10.
     */
    public void setReferences(Reference [] References) {
        this.References = References;
    }

    public ChatTranslationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatTranslationsRequest(ChatTranslationsRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.References != null) {
            this.References = new Reference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new Reference(source.References[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamArrayObj(map, prefix + "References.", this.References);

    }
}

