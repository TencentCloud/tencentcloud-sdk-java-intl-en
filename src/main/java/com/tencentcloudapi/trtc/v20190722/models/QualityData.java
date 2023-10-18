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

public class QualityData extends AbstractModel {

    /**
    * The quality data.
    */
    @SerializedName("Content")
    @Expose
    private TimeValue [] Content;

    /**
    * The user ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The remote user ID. An empty string indicates that the data is upstream data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * The data type.
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get The quality data. 
     * @return Content The quality data.
     */
    public TimeValue [] getContent() {
        return this.Content;
    }

    /**
     * Set The quality data.
     * @param Content The quality data.
     */
    public void setContent(TimeValue [] Content) {
        this.Content = Content;
    }

    /**
     * Get The user ID. 
     * @return UserId The user ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID.
     * @param UserId The user ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The remote user ID. An empty string indicates that the data is upstream data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeerId The remote user ID. An empty string indicates that the data is upstream data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set The remote user ID. An empty string indicates that the data is upstream data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeerId The remote user ID. An empty string indicates that the data is upstream data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get The data type. 
     * @return DataType The data type.
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set The data type.
     * @param DataType The data type.
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    public QualityData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityData(QualityData source) {
        if (source.Content != null) {
            this.Content = new TimeValue[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new TimeValue(source.Content[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

