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

public class ForbidMediaDistributionRequest extends AbstractModel{

    /**
    * List of media files. Up to 20 ones can be submitted at a time.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * forbid: forbids, recover: unblocks.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get List of media files. Up to 20 ones can be submitted at a time. 
     * @return FileIds List of media files. Up to 20 ones can be submitted at a time.
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set List of media files. Up to 20 ones can be submitted at a time.
     * @param FileIds List of media files. Up to 20 ones can be submitted at a time.
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get forbid: forbids, recover: unblocks. 
     * @return Operation forbid: forbids, recover: unblocks.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set forbid: forbids, recover: unblocks.
     * @param Operation forbid: forbids, recover: unblocks.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

