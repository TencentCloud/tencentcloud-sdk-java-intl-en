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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotCOS extends AbstractModel {

    /**
    * UIN of the Tencent Cloud account.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * COS region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * COS bucket name.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Root directory for storing whiteboard snapshots.
    */
    @SerializedName("TargetDir")
    @Expose
    private String TargetDir;

    /**
    * CDN acceleration domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get UIN of the Tencent Cloud account. 
     * @return Uin UIN of the Tencent Cloud account.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set UIN of the Tencent Cloud account.
     * @param Uin UIN of the Tencent Cloud account.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get COS region. 
     * @return Region COS region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set COS region.
     * @param Region COS region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get COS bucket name. 
     * @return Bucket COS bucket name.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket name.
     * @param Bucket COS bucket name.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Root directory for storing whiteboard snapshots. 
     * @return TargetDir Root directory for storing whiteboard snapshots.
     */
    public String getTargetDir() {
        return this.TargetDir;
    }

    /**
     * Set Root directory for storing whiteboard snapshots.
     * @param TargetDir Root directory for storing whiteboard snapshots.
     */
    public void setTargetDir(String TargetDir) {
        this.TargetDir = TargetDir;
    }

    /**
     * Get CDN acceleration domain name. 
     * @return Domain CDN acceleration domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CDN acceleration domain name.
     * @param Domain CDN acceleration domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public SnapshotCOS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotCOS(SnapshotCOS source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.TargetDir != null) {
            this.TargetDir = new String(source.TargetDir);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "TargetDir", this.TargetDir);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

