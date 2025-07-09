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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTranslateRequest extends AbstractModel {

    /**
    * The texts to be translated, which must be encoded in UTF-8 and can contain up to 2,000 characters in a request. For non-pure texts such as those with HTML tags, the translation may fail.
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * Supported source languages:
auto: Automatic language detection
zh: Simplified Chinese
zh_TW: Traditional Chinese
en: English
ja: Japanese
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Bahasa Indonesian
th: Thai
ms: Malay
ar: Arabic
hi: Hindi
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Supported target languages for the above source languages:

<li>zh (Simplified Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>zh-TW (Traditional Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>en (English): zh (Simplified Chinese), zh-TW (Traditional Chinese), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), ms (Malay), and hi (Hindi)</li>
<li>fr (French): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>it (Italian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>de (German): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ru (Russian): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>tr (Turkish): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>pt (Portuguese): zh (Simplified Chinese) and tr (Turkish)</li>
<li>es (Spanish): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ja (Japanese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>vi (Vietnamese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>th (Thai): zh (Simplified Chinese) and en (English)</li>
<li>id (Bahasa Indonesian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ms (Malay): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>ar (Arabic): en (English)</li>
<li>hi (Hindi): en (English)</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * The project ID, which can be obtained from **Console -> Account Center -> Project Management**. If no one is set, enter the default project ID `0`.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * The parameter used to mark the text content that needs to remain untranslated, such as special symbols and names of people and places. You can set only one word for this parameter in each request. Only nouns (like names of people and places) are supported, and verbs or phrases may cause poor translation outcomes.
    */
    @SerializedName("UntranslatedText")
    @Expose
    private String UntranslatedText;

    /**
    * 
    */
    @SerializedName("TermRepoIDList")
    @Expose
    private String [] TermRepoIDList;

    /**
    * 
    */
    @SerializedName("SentRepoIDList")
    @Expose
    private String [] SentRepoIDList;

    /**
     * Get The texts to be translated, which must be encoded in UTF-8 and can contain up to 2,000 characters in a request. For non-pure texts such as those with HTML tags, the translation may fail. 
     * @return SourceText The texts to be translated, which must be encoded in UTF-8 and can contain up to 2,000 characters in a request. For non-pure texts such as those with HTML tags, the translation may fail.
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set The texts to be translated, which must be encoded in UTF-8 and can contain up to 2,000 characters in a request. For non-pure texts such as those with HTML tags, the translation may fail.
     * @param SourceText The texts to be translated, which must be encoded in UTF-8 and can contain up to 2,000 characters in a request. For non-pure texts such as those with HTML tags, the translation may fail.
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get Supported source languages:
auto: Automatic language detection
zh: Simplified Chinese
zh_TW: Traditional Chinese
en: English
ja: Japanese
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Bahasa Indonesian
th: Thai
ms: Malay
ar: Arabic
hi: Hindi 
     * @return Source Supported source languages:
auto: Automatic language detection
zh: Simplified Chinese
zh_TW: Traditional Chinese
en: English
ja: Japanese
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Bahasa Indonesian
th: Thai
ms: Malay
ar: Arabic
hi: Hindi
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Supported source languages:
auto: Automatic language detection
zh: Simplified Chinese
zh_TW: Traditional Chinese
en: English
ja: Japanese
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Bahasa Indonesian
th: Thai
ms: Malay
ar: Arabic
hi: Hindi
     * @param Source Supported source languages:
auto: Automatic language detection
zh: Simplified Chinese
zh_TW: Traditional Chinese
en: English
ja: Japanese
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Bahasa Indonesian
th: Thai
ms: Malay
ar: Arabic
hi: Hindi
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Supported target languages for the above source languages:

<li>zh (Simplified Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>zh-TW (Traditional Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>en (English): zh (Simplified Chinese), zh-TW (Traditional Chinese), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), ms (Malay), and hi (Hindi)</li>
<li>fr (French): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>it (Italian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>de (German): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ru (Russian): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>tr (Turkish): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>pt (Portuguese): zh (Simplified Chinese) and tr (Turkish)</li>
<li>es (Spanish): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ja (Japanese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>vi (Vietnamese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>th (Thai): zh (Simplified Chinese) and en (English)</li>
<li>id (Bahasa Indonesian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ms (Malay): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>ar (Arabic): en (English)</li>
<li>hi (Hindi): en (English)</li> 
     * @return Target Supported target languages for the above source languages:

<li>zh (Simplified Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>zh-TW (Traditional Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>en (English): zh (Simplified Chinese), zh-TW (Traditional Chinese), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), ms (Malay), and hi (Hindi)</li>
<li>fr (French): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>it (Italian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>de (German): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ru (Russian): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>tr (Turkish): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>pt (Portuguese): zh (Simplified Chinese) and tr (Turkish)</li>
<li>es (Spanish): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ja (Japanese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>vi (Vietnamese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>th (Thai): zh (Simplified Chinese) and en (English)</li>
<li>id (Bahasa Indonesian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ms (Malay): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>ar (Arabic): en (English)</li>
<li>hi (Hindi): en (English)</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Supported target languages for the above source languages:

<li>zh (Simplified Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>zh-TW (Traditional Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>en (English): zh (Simplified Chinese), zh-TW (Traditional Chinese), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), ms (Malay), and hi (Hindi)</li>
<li>fr (French): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>it (Italian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>de (German): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ru (Russian): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>tr (Turkish): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>pt (Portuguese): zh (Simplified Chinese) and tr (Turkish)</li>
<li>es (Spanish): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ja (Japanese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>vi (Vietnamese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>th (Thai): zh (Simplified Chinese) and en (English)</li>
<li>id (Bahasa Indonesian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ms (Malay): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>ar (Arabic): en (English)</li>
<li>hi (Hindi): en (English)</li>
     * @param Target Supported target languages for the above source languages:

<li>zh (Simplified Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>zh-TW (Traditional Chinese): en (English), ja (Japanese), fr (French), es (Spanish), it (Italian), tr (Turkish), ru (Russian), pt (Portuguese), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), and ms (Malay)</li>
<li>en (English): zh (Simplified Chinese), zh-TW (Traditional Chinese), ja (Japanese), fr (French), es (Spanish), it (Italian), de (German), tr (Turkish), vi (Vietnamese), id (Bahasa Indonesian), th (Thai), ms (Malay), and hi (Hindi)</li>
<li>fr (French): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>it (Italian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>de (German): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ru (Russian): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>tr (Turkish): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>pt (Portuguese): zh (Simplified Chinese) and tr (Turkish)</li>
<li>es (Spanish): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ja (Japanese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>vi (Vietnamese): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>th (Thai): zh (Simplified Chinese) and en (English)</li>
<li>id (Bahasa Indonesian): zh (Simplified Chinese), zh-TW (Traditional Chinese) and en (English)</li>
<li>ms (Malay): zh (Simplified Chinese) and zh-TW (Traditional Chinese)</li>
<li>ar (Arabic): en (English)</li>
<li>hi (Hindi): en (English)</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get The project ID, which can be obtained from **Console -> Account Center -> Project Management**. If no one is set, enter the default project ID `0`. 
     * @return ProjectId The project ID, which can be obtained from **Console -> Account Center -> Project Management**. If no one is set, enter the default project ID `0`.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The project ID, which can be obtained from **Console -> Account Center -> Project Management**. If no one is set, enter the default project ID `0`.
     * @param ProjectId The project ID, which can be obtained from **Console -> Account Center -> Project Management**. If no one is set, enter the default project ID `0`.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The parameter used to mark the text content that needs to remain untranslated, such as special symbols and names of people and places. You can set only one word for this parameter in each request. Only nouns (like names of people and places) are supported, and verbs or phrases may cause poor translation outcomes. 
     * @return UntranslatedText The parameter used to mark the text content that needs to remain untranslated, such as special symbols and names of people and places. You can set only one word for this parameter in each request. Only nouns (like names of people and places) are supported, and verbs or phrases may cause poor translation outcomes.
     */
    public String getUntranslatedText() {
        return this.UntranslatedText;
    }

    /**
     * Set The parameter used to mark the text content that needs to remain untranslated, such as special symbols and names of people and places. You can set only one word for this parameter in each request. Only nouns (like names of people and places) are supported, and verbs or phrases may cause poor translation outcomes.
     * @param UntranslatedText The parameter used to mark the text content that needs to remain untranslated, such as special symbols and names of people and places. You can set only one word for this parameter in each request. Only nouns (like names of people and places) are supported, and verbs or phrases may cause poor translation outcomes.
     */
    public void setUntranslatedText(String UntranslatedText) {
        this.UntranslatedText = UntranslatedText;
    }

    /**
     * Get  
     * @return TermRepoIDList 
     */
    public String [] getTermRepoIDList() {
        return this.TermRepoIDList;
    }

    /**
     * Set 
     * @param TermRepoIDList 
     */
    public void setTermRepoIDList(String [] TermRepoIDList) {
        this.TermRepoIDList = TermRepoIDList;
    }

    /**
     * Get  
     * @return SentRepoIDList 
     */
    public String [] getSentRepoIDList() {
        return this.SentRepoIDList;
    }

    /**
     * Set 
     * @param SentRepoIDList 
     */
    public void setSentRepoIDList(String [] SentRepoIDList) {
        this.SentRepoIDList = SentRepoIDList;
    }

    public TextTranslateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTranslateRequest(TextTranslateRequest source) {
        if (source.SourceText != null) {
            this.SourceText = new String(source.SourceText);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UntranslatedText != null) {
            this.UntranslatedText = new String(source.UntranslatedText);
        }
        if (source.TermRepoIDList != null) {
            this.TermRepoIDList = new String[source.TermRepoIDList.length];
            for (int i = 0; i < source.TermRepoIDList.length; i++) {
                this.TermRepoIDList[i] = new String(source.TermRepoIDList[i]);
            }
        }
        if (source.SentRepoIDList != null) {
            this.SentRepoIDList = new String[source.SentRepoIDList.length];
            for (int i = 0; i < source.SentRepoIDList.length; i++) {
                this.SentRepoIDList[i] = new String(source.SentRepoIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UntranslatedText", this.UntranslatedText);
        this.setParamArraySimple(map, prefix + "TermRepoIDList.", this.TermRepoIDList);
        this.setParamArraySimple(map, prefix + "SentRepoIDList.", this.SentRepoIDList);

    }
}

