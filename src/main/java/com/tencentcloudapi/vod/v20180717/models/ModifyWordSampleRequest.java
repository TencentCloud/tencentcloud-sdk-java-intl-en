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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWordSampleRequest extends AbstractModel {

    /**
    * Keyword. Length limit: 128 characters.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <b>Keyword usage. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition
2. Recognition.Asr: ASR-based content recognition
3. Review.Ocr: OCR-based inappropriate information recognition
4. Review.Asr: ASR-based inappropriate information recognition
<b>Valid values can also be:</b>
5. Recognition: ASR- and OCR-based content recognition; equivalent to 1+2
6. Review: ASR- and OCR-based inappropriate information recognition; equivalent to 3+4
7. All: equivalent to 1+2+3+4
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
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <b>Keyword usage. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition
2. Recognition.Asr: ASR-based content recognition
3. Review.Ocr: OCR-based inappropriate information recognition
4. Review.Asr: ASR-based inappropriate information recognition
<b>Valid values can also be:</b>
5. Recognition: ASR- and OCR-based content recognition; equivalent to 1+2
6. Review: ASR- and OCR-based inappropriate information recognition; equivalent to 3+4
7. All: equivalent to 1+2+3+4 
     * @return Usages <b>Keyword usage. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition
2. Recognition.Asr: ASR-based content recognition
3. Review.Ocr: OCR-based inappropriate information recognition
4. Review.Asr: ASR-based inappropriate information recognition
<b>Valid values can also be:</b>
5. Recognition: ASR- and OCR-based content recognition; equivalent to 1+2
6. Review: ASR- and OCR-based inappropriate information recognition; equivalent to 3+4
7. All: equivalent to 1+2+3+4
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set <b>Keyword usage. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition
2. Recognition.Asr: ASR-based content recognition
3. Review.Ocr: OCR-based inappropriate information recognition
4. Review.Asr: ASR-based inappropriate information recognition
<b>Valid values can also be:</b>
5. Recognition: ASR- and OCR-based content recognition; equivalent to 1+2
6. Review: ASR- and OCR-based inappropriate information recognition; equivalent to 3+4
7. All: equivalent to 1+2+3+4
     * @param Usages <b>Keyword usage. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition
2. Recognition.Asr: ASR-based content recognition
3. Review.Ocr: OCR-based inappropriate information recognition
4. Review.Asr: ASR-based inappropriate information recognition
<b>Valid values can also be:</b>
5. Recognition: ASR- and OCR-based content recognition; equivalent to 1+2
6. Review: ASR- and OCR-based inappropriate information recognition; equivalent to 3+4
7. All: equivalent to 1+2+3+4
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

    public ModifyWordSampleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWordSampleRequest(ModifyWordSampleRequest source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Usages != null) {
            this.Usages = new String[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new String(source.Usages[i]);
            }
        }
        if (source.TagOperationInfo != null) {
            this.TagOperationInfo = new AiSampleTagOperation(source.TagOperationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamObj(map, prefix + "TagOperationInfo.", this.TagOperationInfo);

    }
}

