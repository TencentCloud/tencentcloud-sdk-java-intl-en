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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageDataResponse extends AbstractModel{

    /**
    * Total number of current media files.
    */
    @SerializedName("MediaCount")
    @Expose
    private Long MediaCount;

    /**
    * Total current storage capacity in bytes.
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * Current Standard_IA storage capacity in bytes.
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * Current Standard storage capacity in bytes.
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of current media files. 
     * @return MediaCount Total number of current media files.
     */
    public Long getMediaCount() {
        return this.MediaCount;
    }

    /**
     * Set Total number of current media files.
     * @param MediaCount Total number of current media files.
     */
    public void setMediaCount(Long MediaCount) {
        this.MediaCount = MediaCount;
    }

    /**
     * Get Total current storage capacity in bytes. 
     * @return TotalStorage Total current storage capacity in bytes.
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set Total current storage capacity in bytes.
     * @param TotalStorage Total current storage capacity in bytes.
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get Current Standard_IA storage capacity in bytes. 
     * @return InfrequentStorage Current Standard_IA storage capacity in bytes.
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set Current Standard_IA storage capacity in bytes.
     * @param InfrequentStorage Current Standard_IA storage capacity in bytes.
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get Current Standard storage capacity in bytes. 
     * @return StandardStorage Current Standard storage capacity in bytes.
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set Current Standard storage capacity in bytes.
     * @param StandardStorage Current Standard storage capacity in bytes.
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaCount", this.MediaCount);
        this.setParamSimple(map, prefix + "TotalStorage", this.TotalStorage);
        this.setParamSimple(map, prefix + "InfrequentStorage", this.InfrequentStorage);
        this.setParamSimple(map, prefix + "StandardStorage", this.StandardStorage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

