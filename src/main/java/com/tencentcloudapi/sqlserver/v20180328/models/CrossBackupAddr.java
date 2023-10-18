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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossBackupAddr extends AbstractModel {

    /**
    * The target region of cross-region backup
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * The address used to download the cross-region backup over a private network
    */
    @SerializedName("CrossInternalAddr")
    @Expose
    private String CrossInternalAddr;

    /**
    * The address used to download the cross-region backup over a public network
    */
    @SerializedName("CrossExternalAddr")
    @Expose
    private String CrossExternalAddr;

    /**
     * Get The target region of cross-region backup 
     * @return CrossRegion The target region of cross-region backup
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set The target region of cross-region backup
     * @param CrossRegion The target region of cross-region backup
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get The address used to download the cross-region backup over a private network 
     * @return CrossInternalAddr The address used to download the cross-region backup over a private network
     */
    public String getCrossInternalAddr() {
        return this.CrossInternalAddr;
    }

    /**
     * Set The address used to download the cross-region backup over a private network
     * @param CrossInternalAddr The address used to download the cross-region backup over a private network
     */
    public void setCrossInternalAddr(String CrossInternalAddr) {
        this.CrossInternalAddr = CrossInternalAddr;
    }

    /**
     * Get The address used to download the cross-region backup over a public network 
     * @return CrossExternalAddr The address used to download the cross-region backup over a public network
     */
    public String getCrossExternalAddr() {
        return this.CrossExternalAddr;
    }

    /**
     * Set The address used to download the cross-region backup over a public network
     * @param CrossExternalAddr The address used to download the cross-region backup over a public network
     */
    public void setCrossExternalAddr(String CrossExternalAddr) {
        this.CrossExternalAddr = CrossExternalAddr;
    }

    public CrossBackupAddr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossBackupAddr(CrossBackupAddr source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.CrossInternalAddr != null) {
            this.CrossInternalAddr = new String(source.CrossInternalAddr);
        }
        if (source.CrossExternalAddr != null) {
            this.CrossExternalAddr = new String(source.CrossExternalAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "CrossInternalAddr", this.CrossInternalAddr);
        this.setParamSimple(map, prefix + "CrossExternalAddr", this.CrossExternalAddr);

    }
}

