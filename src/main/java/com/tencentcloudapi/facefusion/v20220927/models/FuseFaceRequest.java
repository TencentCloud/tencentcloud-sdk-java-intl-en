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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceRequest extends AbstractModel {

    /**
    * Activity ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Material ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Image return method (url or base64). You cannot use both methods at the same time. The URL is valid for 7 days.
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
    * Face position information on the user face image and material template image. No more than 6 entries.
    */
    @SerializedName("MergeInfos")
    @Expose
    private MergeInfo [] MergeInfos;

    /**
    * Switch indicating whether to add a synthesis logo to the fusion result image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the result image uses face fusion technology and is synthesized by AI.
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * Logo content settings
By default, the text "Synthesized by AI" is added to the bottom right corner of the fusion result image. You can also use other texts.
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * Fusion parameter.
    */
    @SerializedName("FuseParam")
    @Expose
    private FuseParam FuseParam;

    /**
     * Get Activity ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>. 
     * @return ProjectId Activity ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Activity ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
     * @param ProjectId Activity ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Material ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>. 
     * @return ModelId Material ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set Material ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
     * @param ModelId Material ID. Check the ID in the <a href="https://console.cloud.tencent.com/facefusion" target="_blank"> Face Fusion console</a>.
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Image return method (url or base64). You cannot use both methods at the same time. The URL is valid for 7 days. 
     * @return RspImgType Image return method (url or base64). You cannot use both methods at the same time. The URL is valid for 7 days.
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set Image return method (url or base64). You cannot use both methods at the same time. The URL is valid for 7 days.
     * @param RspImgType Image return method (url or base64). You cannot use both methods at the same time. The URL is valid for 7 days.
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * Get Face position information on the user face image and material template image. No more than 6 entries. 
     * @return MergeInfos Face position information on the user face image and material template image. No more than 6 entries.
     */
    public MergeInfo [] getMergeInfos() {
        return this.MergeInfos;
    }

    /**
     * Set Face position information on the user face image and material template image. No more than 6 entries.
     * @param MergeInfos Face position information on the user face image and material template image. No more than 6 entries.
     */
    public void setMergeInfos(MergeInfo [] MergeInfos) {
        this.MergeInfos = MergeInfos;
    }

    /**
     * Get Switch indicating whether to add a synthesis logo to the fusion result image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the result image uses face fusion technology and is synthesized by AI. 
     * @return LogoAdd Switch indicating whether to add a synthesis logo to the fusion result image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the result image uses face fusion technology and is synthesized by AI.
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set Switch indicating whether to add a synthesis logo to the fusion result image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the result image uses face fusion technology and is synthesized by AI.
     * @param LogoAdd Switch indicating whether to add a synthesis logo to the fusion result image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the result image uses face fusion technology and is synthesized by AI.
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get Logo content settings
By default, the text "Synthesized by AI" is added to the bottom right corner of the fusion result image. You can also use other texts. 
     * @return LogoParam Logo content settings
By default, the text "Synthesized by AI" is added to the bottom right corner of the fusion result image. You can also use other texts.
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set Logo content settings
By default, the text "Synthesized by AI" is added to the bottom right corner of the fusion result image. You can also use other texts.
     * @param LogoParam Logo content settings
By default, the text "Synthesized by AI" is added to the bottom right corner of the fusion result image. You can also use other texts.
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get Fusion parameter. 
     * @return FuseParam Fusion parameter.
     */
    public FuseParam getFuseParam() {
        return this.FuseParam;
    }

    /**
     * Set Fusion parameter.
     * @param FuseParam Fusion parameter.
     */
    public void setFuseParam(FuseParam FuseParam) {
        this.FuseParam = FuseParam;
    }

    public FuseFaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FuseFaceRequest(FuseFaceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
        if (source.MergeInfos != null) {
            this.MergeInfos = new MergeInfo[source.MergeInfos.length];
            for (int i = 0; i < source.MergeInfos.length; i++) {
                this.MergeInfos[i] = new MergeInfo(source.MergeInfos[i]);
            }
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.FuseParam != null) {
            this.FuseParam = new FuseParam(source.FuseParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamArrayObj(map, prefix + "MergeInfos.", this.MergeInfos);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamObj(map, prefix + "FuseParam.", this.FuseParam);

    }
}

