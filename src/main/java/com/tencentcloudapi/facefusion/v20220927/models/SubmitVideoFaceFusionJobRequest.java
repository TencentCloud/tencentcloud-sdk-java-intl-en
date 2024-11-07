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

public class SubmitVideoFaceFusionJobRequest extends AbstractModel {

    /**
    * Activity ID. Check it in the video face fusion console.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Material ID. Check it in the video face fusion console.
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Face position information on the user face image and material template image. Only one entry is allowed.
    */
    @SerializedName("MergeInfos")
    @Expose
    private MergeInfo [] MergeInfos;

    /**
    * 0: inappropriate content recognition not required; 1: inappropriate content recognition required. Default value: 0.
Note: Once the inappropriate content recognition service is enabled, you need to decide whether to adjust your business logic based on the returned results. For example, you need to replace the image if the system informs you that the image does not meet the requirements.
**<font color=#1E90FF>Note: This field will be deprecated later due to business adjustments. It is not recommended for use.</font>**
    */
    @SerializedName("CelebrityIdentify")
    @Expose
    private Long CelebrityIdentify;

    /**
    * Video watermark logo parameter
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * COS pre-signed URL (PUT method). If this parameter is specified, the video after fusion will be uploaded to this URL.
**<font color=#1E90FF>Note: If upload to this URL fails, the video will be uploaded to the default address of Tencent Cloud.</font>**
    */
    @SerializedName("UserDesignatedUrl")
    @Expose
    private String UserDesignatedUrl;

    /**
    * User IP address
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * Video metadata field
    */
    @SerializedName("MetaData")
    @Expose
    private MetaData [] MetaData;

    /**
     * Get Activity ID. Check it in the video face fusion console. 
     * @return ProjectId Activity ID. Check it in the video face fusion console.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Activity ID. Check it in the video face fusion console.
     * @param ProjectId Activity ID. Check it in the video face fusion console.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Material ID. Check it in the video face fusion console. 
     * @return ModelId Material ID. Check it in the video face fusion console.
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set Material ID. Check it in the video face fusion console.
     * @param ModelId Material ID. Check it in the video face fusion console.
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Face position information on the user face image and material template image. Only one entry is allowed. 
     * @return MergeInfos Face position information on the user face image and material template image. Only one entry is allowed.
     */
    public MergeInfo [] getMergeInfos() {
        return this.MergeInfos;
    }

    /**
     * Set Face position information on the user face image and material template image. Only one entry is allowed.
     * @param MergeInfos Face position information on the user face image and material template image. Only one entry is allowed.
     */
    public void setMergeInfos(MergeInfo [] MergeInfos) {
        this.MergeInfos = MergeInfos;
    }

    /**
     * Get 0: inappropriate content recognition not required; 1: inappropriate content recognition required. Default value: 0.
Note: Once the inappropriate content recognition service is enabled, you need to decide whether to adjust your business logic based on the returned results. For example, you need to replace the image if the system informs you that the image does not meet the requirements.
**<font color=#1E90FF>Note: This field will be deprecated later due to business adjustments. It is not recommended for use.</font>** 
     * @return CelebrityIdentify 0: inappropriate content recognition not required; 1: inappropriate content recognition required. Default value: 0.
Note: Once the inappropriate content recognition service is enabled, you need to decide whether to adjust your business logic based on the returned results. For example, you need to replace the image if the system informs you that the image does not meet the requirements.
**<font color=#1E90FF>Note: This field will be deprecated later due to business adjustments. It is not recommended for use.</font>**
     */
    public Long getCelebrityIdentify() {
        return this.CelebrityIdentify;
    }

    /**
     * Set 0: inappropriate content recognition not required; 1: inappropriate content recognition required. Default value: 0.
Note: Once the inappropriate content recognition service is enabled, you need to decide whether to adjust your business logic based on the returned results. For example, you need to replace the image if the system informs you that the image does not meet the requirements.
**<font color=#1E90FF>Note: This field will be deprecated later due to business adjustments. It is not recommended for use.</font>**
     * @param CelebrityIdentify 0: inappropriate content recognition not required; 1: inappropriate content recognition required. Default value: 0.
Note: Once the inappropriate content recognition service is enabled, you need to decide whether to adjust your business logic based on the returned results. For example, you need to replace the image if the system informs you that the image does not meet the requirements.
**<font color=#1E90FF>Note: This field will be deprecated later due to business adjustments. It is not recommended for use.</font>**
     */
    public void setCelebrityIdentify(Long CelebrityIdentify) {
        this.CelebrityIdentify = CelebrityIdentify;
    }

    /**
     * Get Video watermark logo parameter 
     * @return LogoParam Video watermark logo parameter
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set Video watermark logo parameter
     * @param LogoParam Video watermark logo parameter
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get COS pre-signed URL (PUT method). If this parameter is specified, the video after fusion will be uploaded to this URL.
**<font color=#1E90FF>Note: If upload to this URL fails, the video will be uploaded to the default address of Tencent Cloud.</font>** 
     * @return UserDesignatedUrl COS pre-signed URL (PUT method). If this parameter is specified, the video after fusion will be uploaded to this URL.
**<font color=#1E90FF>Note: If upload to this URL fails, the video will be uploaded to the default address of Tencent Cloud.</font>**
     */
    public String getUserDesignatedUrl() {
        return this.UserDesignatedUrl;
    }

    /**
     * Set COS pre-signed URL (PUT method). If this parameter is specified, the video after fusion will be uploaded to this URL.
**<font color=#1E90FF>Note: If upload to this URL fails, the video will be uploaded to the default address of Tencent Cloud.</font>**
     * @param UserDesignatedUrl COS pre-signed URL (PUT method). If this parameter is specified, the video after fusion will be uploaded to this URL.
**<font color=#1E90FF>Note: If upload to this URL fails, the video will be uploaded to the default address of Tencent Cloud.</font>**
     */
    public void setUserDesignatedUrl(String UserDesignatedUrl) {
        this.UserDesignatedUrl = UserDesignatedUrl;
    }

    /**
     * Get User IP address 
     * @return UserIp User IP address
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set User IP address
     * @param UserIp User IP address
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get Video metadata field 
     * @return MetaData Video metadata field
     */
    public MetaData [] getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Video metadata field
     * @param MetaData Video metadata field
     */
    public void setMetaData(MetaData [] MetaData) {
        this.MetaData = MetaData;
    }

    public SubmitVideoFaceFusionJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitVideoFaceFusionJobRequest(SubmitVideoFaceFusionJobRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.MergeInfos != null) {
            this.MergeInfos = new MergeInfo[source.MergeInfos.length];
            for (int i = 0; i < source.MergeInfos.length; i++) {
                this.MergeInfos[i] = new MergeInfo(source.MergeInfos[i]);
            }
        }
        if (source.CelebrityIdentify != null) {
            this.CelebrityIdentify = new Long(source.CelebrityIdentify);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.UserDesignatedUrl != null) {
            this.UserDesignatedUrl = new String(source.UserDesignatedUrl);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.MetaData != null) {
            this.MetaData = new MetaData[source.MetaData.length];
            for (int i = 0; i < source.MetaData.length; i++) {
                this.MetaData[i] = new MetaData(source.MetaData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamArrayObj(map, prefix + "MergeInfos.", this.MergeInfos);
        this.setParamSimple(map, prefix + "CelebrityIdentify", this.CelebrityIdentify);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "UserDesignatedUrl", this.UserDesignatedUrl);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamArrayObj(map, prefix + "MetaData.", this.MetaData);

    }
}

