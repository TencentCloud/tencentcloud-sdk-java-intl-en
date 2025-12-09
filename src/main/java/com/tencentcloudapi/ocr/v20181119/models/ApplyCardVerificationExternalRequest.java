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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyCardVerificationExternalRequest extends AbstractModel {

    /**
    * Specifies the country of the document.
ARG:Argentina
AUS:Australia
KHM:Cambodia
CAN:Canada
SGP:Singapore
CHL:Chile
DEU:Germany
MEX:Mexico
MMR:Myanmar
NZL:New Zealand
BGD:Bangladesh
NGA:Nigeria
PAK:Pakistan
RUS:Russia
IDN:Indonesia
HKG:Hong Kong, China
THA:Thailand
MYS:Malaysia
JPN:Japan
PHL:Philippines
MAC:Macao, China
CHN:ChinaPermit
TWN:Taiwan, China
BGD:Bangladesh
NGA:Nigeria 
PAK:Pakistan

AUTO: supports cards and documents from 200+ countries
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Document type.
ID_CARD
PASSPORT
DRIVING_LICENSE
RESIDENCE_PERMIT (Supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * The Base64 value of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
    */
    @SerializedName("ImageBase64Front")
    @Expose
    private String ImageBase64Front;

    /**
    * The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
    */
    @SerializedName("ImageBase64Back")
    @Expose
    private String ImageBase64Back;

    /**
    * Url of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
    */
    @SerializedName("ImageUrlFront")
    @Expose
    private String ImageUrlFront;

    /**
    * Specifies the Url of the document Back. supported image formats: PNG, JPG/JPEG
Supported image size: no more than 2M after Base64 encoding. image download time should not exceed 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only use ImageUrlBack.

    */
    @SerializedName("ImageUrlBack")
    @Expose
    private String ImageUrlBack;

    /**
    * Whether to extract the ID portrait. Default value: false.
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
     * Get Specifies the country of the document.
ARG:Argentina
AUS:Australia
KHM:Cambodia
CAN:Canada
SGP:Singapore
CHL:Chile
DEU:Germany
MEX:Mexico
MMR:Myanmar
NZL:New Zealand
BGD:Bangladesh
NGA:Nigeria
PAK:Pakistan
RUS:Russia
IDN:Indonesia
HKG:Hong Kong, China
THA:Thailand
MYS:Malaysia
JPN:Japan
PHL:Philippines
MAC:Macao, China
CHN:ChinaPermit
TWN:Taiwan, China
BGD:Bangladesh
NGA:Nigeria 
PAK:Pakistan

AUTO: supports cards and documents from 200+ countries 
     * @return Nationality Specifies the country of the document.
ARG:Argentina
AUS:Australia
KHM:Cambodia
CAN:Canada
SGP:Singapore
CHL:Chile
DEU:Germany
MEX:Mexico
MMR:Myanmar
NZL:New Zealand
BGD:Bangladesh
NGA:Nigeria
PAK:Pakistan
RUS:Russia
IDN:Indonesia
HKG:Hong Kong, China
THA:Thailand
MYS:Malaysia
JPN:Japan
PHL:Philippines
MAC:Macao, China
CHN:ChinaPermit
TWN:Taiwan, China
BGD:Bangladesh
NGA:Nigeria 
PAK:Pakistan

AUTO: supports cards and documents from 200+ countries
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Specifies the country of the document.
ARG:Argentina
AUS:Australia
KHM:Cambodia
CAN:Canada
SGP:Singapore
CHL:Chile
DEU:Germany
MEX:Mexico
MMR:Myanmar
NZL:New Zealand
BGD:Bangladesh
NGA:Nigeria
PAK:Pakistan
RUS:Russia
IDN:Indonesia
HKG:Hong Kong, China
THA:Thailand
MYS:Malaysia
JPN:Japan
PHL:Philippines
MAC:Macao, China
CHN:ChinaPermit
TWN:Taiwan, China
BGD:Bangladesh
NGA:Nigeria 
PAK:Pakistan

AUTO: supports cards and documents from 200+ countries
     * @param Nationality Specifies the country of the document.
ARG:Argentina
AUS:Australia
KHM:Cambodia
CAN:Canada
SGP:Singapore
CHL:Chile
DEU:Germany
MEX:Mexico
MMR:Myanmar
NZL:New Zealand
BGD:Bangladesh
NGA:Nigeria
PAK:Pakistan
RUS:Russia
IDN:Indonesia
HKG:Hong Kong, China
THA:Thailand
MYS:Malaysia
JPN:Japan
PHL:Philippines
MAC:Macao, China
CHN:ChinaPermit
TWN:Taiwan, China
BGD:Bangladesh
NGA:Nigeria 
PAK:Pakistan

AUTO: supports cards and documents from 200+ countries
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Document type.
ID_CARD
PASSPORT
DRIVING_LICENSE
RESIDENCE_PERMIT (Supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore). 
     * @return CardType Document type.
ID_CARD
PASSPORT
DRIVING_LICENSE
RESIDENCE_PERMIT (Supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set Document type.
ID_CARD
PASSPORT
DRIVING_LICENSE
RESIDENCE_PERMIT (Supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
     * @param CardType Document type.
ID_CARD
PASSPORT
DRIVING_LICENSE
RESIDENCE_PERMIT (Supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get The Base64 value of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used. 
     * @return ImageBase64Front The Base64 value of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public String getImageBase64Front() {
        return this.ImageBase64Front;
    }

    /**
     * Set The Base64 value of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
     * @param ImageBase64Front The Base64 value of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public void setImageBase64Front(String ImageBase64Front) {
        this.ImageBase64Front = ImageBase64Front;
    }

    /**
     * Get The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used. 
     * @return ImageBase64Back The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
     */
    public String getImageBase64Back() {
        return this.ImageBase64Back;
    }

    /**
     * Set The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
     * @param ImageBase64Back The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
     */
    public void setImageBase64Back(String ImageBase64Back) {
        this.ImageBase64Back = ImageBase64Back;
    }

    /**
     * Get Url of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used. 
     * @return ImageUrlFront Url of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public String getImageUrlFront() {
        return this.ImageUrlFront;
    }

    /**
     * Set Url of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
     * @param ImageUrlFront Url of the document Front. supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public void setImageUrlFront(String ImageUrlFront) {
        this.ImageUrlFront = ImageUrlFront;
    }

    /**
     * Get Specifies the Url of the document Back. supported image formats: PNG, JPG/JPEG
Supported image size: no more than 2M after Base64 encoding. image download time should not exceed 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only use ImageUrlBack.
 
     * @return ImageUrlBack Specifies the Url of the document Back. supported image formats: PNG, JPG/JPEG
Supported image size: no more than 2M after Base64 encoding. image download time should not exceed 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only use ImageUrlBack.

     */
    public String getImageUrlBack() {
        return this.ImageUrlBack;
    }

    /**
     * Set Specifies the Url of the document Back. supported image formats: PNG, JPG/JPEG
Supported image size: no more than 2M after Base64 encoding. image download time should not exceed 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only use ImageUrlBack.

     * @param ImageUrlBack Specifies the Url of the document Back. supported image formats: PNG, JPG/JPEG
Supported image size: no more than 2M after Base64 encoding. image download time should not exceed 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only use ImageUrlBack.

     */
    public void setImageUrlBack(String ImageUrlBack) {
        this.ImageUrlBack = ImageUrlBack;
    }

    /**
     * Get Whether to extract the ID portrait. Default value: false. 
     * @return ReturnHeadImage Whether to extract the ID portrait. Default value: false.
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set Whether to extract the ID portrait. Default value: false.
     * @param ReturnHeadImage Whether to extract the ID portrait. Default value: false.
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    public ApplyCardVerificationExternalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCardVerificationExternalRequest(ApplyCardVerificationExternalRequest source) {
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.ImageBase64Front != null) {
            this.ImageBase64Front = new String(source.ImageBase64Front);
        }
        if (source.ImageBase64Back != null) {
            this.ImageBase64Back = new String(source.ImageBase64Back);
        }
        if (source.ImageUrlFront != null) {
            this.ImageUrlFront = new String(source.ImageUrlFront);
        }
        if (source.ImageUrlBack != null) {
            this.ImageUrlBack = new String(source.ImageUrlBack);
        }
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "ImageBase64Front", this.ImageBase64Front);
        this.setParamSimple(map, prefix + "ImageBase64Back", this.ImageBase64Back);
        this.setParamSimple(map, prefix + "ImageUrlFront", this.ImageUrlFront);
        this.setParamSimple(map, prefix + "ImageUrlBack", this.ImageUrlBack);
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);

    }
}

