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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWordSampleRequest extends AbstractModel{

    /**
    * Keyword. Length limit: 128 characters.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <b>Keyword use case. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based detection of inappropriate content;
4. Review.Asr：ASR-based detection of inappropriate content;
<b>These values can be merged as follows:</b>
5. Recognition: ASR- and OCR-based content recognition, equivalent to 1 and 2 combined;
6. Review: ASR- and OCR-based detection of inappropriate content, equivalent to 3 and 4 combined.
7. All: all of the above, equivalent to 1, 2, 3, and 4 combined.
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * Tag operation information.
    */
    @SerializedName("TagOperationInfo")
    @Expose
    private AiSampleTagOperation TagOperationInfo;

    /**
     * Get Keyword. Length limit: 128 characters. 
     * @return Keyword Keyword. Length limit: 128 characters.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword. Length limit: 128 characters.
     * @param Keyword Keyword. Length limit: 128 characters.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <b>Keyword use case. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based detection of inappropriate content;
4. Review.Asr：ASR-based detection of inappropriate content;
<b>These values can be merged as follows:</b>
5. Recognition: ASR- and OCR-based content recognition, equivalent to 1 and 2 combined;
6. Review: ASR- and OCR-based detection of inappropriate content, equivalent to 3 and 4 combined.
7. All: all of the above, equivalent to 1, 2, 3, and 4 combined. 
     * @return Usages <b>Keyword use case. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based detection of inappropriate content;
4. Review.Asr：ASR-based detection of inappropriate content;
<b>These values can be merged as follows:</b>
5. Recognition: ASR- and OCR-based content recognition, equivalent to 1 and 2 combined;
6. Review: ASR- and OCR-based detection of inappropriate content, equivalent to 3 and 4 combined.
7. All: all of the above, equivalent to 1, 2, 3, and 4 combined.
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set <b>Keyword use case. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based detection of inappropriate content;
4. Review.Asr：ASR-based detection of inappropriate content;
<b>These values can be merged as follows:</b>
5. Recognition: ASR- and OCR-based content recognition, equivalent to 1 and 2 combined;
6. Review: ASR- and OCR-based detection of inappropriate content, equivalent to 3 and 4 combined.
7. All: all of the above, equivalent to 1, 2, 3, and 4 combined.
     * @param Usages <b>Keyword use case. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based detection of inappropriate content;
4. Review.Asr：ASR-based detection of inappropriate content;
<b>These values can be merged as follows:</b>
5. Recognition: ASR- and OCR-based content recognition, equivalent to 1 and 2 combined;
6. Review: ASR- and OCR-based detection of inappropriate content, equivalent to 3 and 4 combined.
7. All: all of the above, equivalent to 1, 2, 3, and 4 combined.
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get Tag operation information. 
     * @return TagOperationInfo Tag operation information.
     */
    public AiSampleTagOperation getTagOperationInfo() {
        return this.TagOperationInfo;
    }

    /**
     * Set Tag operation information.
     * @param TagOperationInfo Tag operation information.
     */
    public void setTagOperationInfo(AiSampleTagOperation TagOperationInfo) {
        this.TagOperationInfo = TagOperationInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamObj(map, prefix + "TagOperationInfo.", this.TagOperationInfo);

    }
}

