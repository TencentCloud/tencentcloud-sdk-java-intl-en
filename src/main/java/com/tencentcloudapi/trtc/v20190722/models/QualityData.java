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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityData extends AbstractModel{

    /**
    * Data content
    */
    @SerializedName("Content")
    @Expose
    private TimeValue [] Content;

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Peer ID. An empty value indicates that the returned data is upstream.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * Data type
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get Data content 
     * @return Content Data content
     */
    public TimeValue [] getContent() {
        return this.Content;
    }

    /**
     * Set Data content
     * @param Content Data content
     */
    public void setContent(TimeValue [] Content) {
        this.Content = Content;
    }

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Peer ID. An empty value indicates that the returned data is upstream. 
     * @return PeerId Peer ID. An empty value indicates that the returned data is upstream.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set Peer ID. An empty value indicates that the returned data is upstream.
     * @param PeerId Peer ID. An empty value indicates that the returned data is upstream.
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get Data type 
     * @return DataType Data type
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set Data type
     * @param DataType Data type
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
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

