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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcStoreCosParam extends AbstractModel {

    /**
    * Name of the COS bucket to store to. This value is required if you need to store the results in COS. Example value: bucket.
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * Region of the COS bucket to store to. This is required if you need to upload the results to COS. Example value: ap-guangzhou.
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * Path of the COS bucket to store to.Optional.Example value: my_file.
    */
    @SerializedName("CosBucketPath")
    @Expose
    private String CosBucketPath;

    /**
     * Get Name of the COS bucket to store to. This value is required if you need to store the results in COS. Example value: bucket. 
     * @return CosBucketName Name of the COS bucket to store to. This value is required if you need to store the results in COS. Example value: bucket.
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set Name of the COS bucket to store to. This value is required if you need to store the results in COS. Example value: bucket.
     * @param CosBucketName Name of the COS bucket to store to. This value is required if you need to store the results in COS. Example value: bucket.
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get Region of the COS bucket to store to. This is required if you need to upload the results to COS. Example value: ap-guangzhou. 
     * @return CosBucketRegion Region of the COS bucket to store to. This is required if you need to upload the results to COS. Example value: ap-guangzhou.
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set Region of the COS bucket to store to. This is required if you need to upload the results to COS. Example value: ap-guangzhou.
     * @param CosBucketRegion Region of the COS bucket to store to. This is required if you need to upload the results to COS. Example value: ap-guangzhou.
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get Path of the COS bucket to store to.Optional.Example value: my_file. 
     * @return CosBucketPath Path of the COS bucket to store to.Optional.Example value: my_file.
     */
    public String getCosBucketPath() {
        return this.CosBucketPath;
    }

    /**
     * Set Path of the COS bucket to store to.Optional.Example value: my_file.
     * @param CosBucketPath Path of the COS bucket to store to.Optional.Example value: my_file.
     */
    public void setCosBucketPath(String CosBucketPath) {
        this.CosBucketPath = CosBucketPath;
    }

    public AigcStoreCosParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcStoreCosParam(AigcStoreCosParam source) {
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.CosBucketPath != null) {
            this.CosBucketPath = new String(source.CosBucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "CosBucketPath", this.CosBucketPath);

    }
}

