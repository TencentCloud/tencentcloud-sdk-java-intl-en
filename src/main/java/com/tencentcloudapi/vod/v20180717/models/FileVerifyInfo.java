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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileVerifyInfo extends AbstractModel {

    /**
    * File verification URL guidance.
    */
    @SerializedName("FileVerifyUrl")
    @Expose
    private String FileVerifyUrl;

    /**
    * File verification domain name list.
    */
    @SerializedName("FileVerifyDomains")
    @Expose
    private String [] FileVerifyDomains;

    /**
    * File verification file name.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileVerifyName")
    @Expose
    private String FileVerifyName;

    /**
     * Get File verification URL guidance. 
     * @return FileVerifyUrl File verification URL guidance.
     */
    public String getFileVerifyUrl() {
        return this.FileVerifyUrl;
    }

    /**
     * Set File verification URL guidance.
     * @param FileVerifyUrl File verification URL guidance.
     */
    public void setFileVerifyUrl(String FileVerifyUrl) {
        this.FileVerifyUrl = FileVerifyUrl;
    }

    /**
     * Get File verification domain name list. 
     * @return FileVerifyDomains File verification domain name list.
     */
    public String [] getFileVerifyDomains() {
        return this.FileVerifyDomains;
    }

    /**
     * Set File verification domain name list.
     * @param FileVerifyDomains File verification domain name list.
     */
    public void setFileVerifyDomains(String [] FileVerifyDomains) {
        this.FileVerifyDomains = FileVerifyDomains;
    }

    /**
     * Get File verification file name.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileVerifyName File verification file name.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileVerifyName() {
        return this.FileVerifyName;
    }

    /**
     * Set File verification file name.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileVerifyName File verification file name.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileVerifyName(String FileVerifyName) {
        this.FileVerifyName = FileVerifyName;
    }

    public FileVerifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileVerifyInfo(FileVerifyInfo source) {
        if (source.FileVerifyUrl != null) {
            this.FileVerifyUrl = new String(source.FileVerifyUrl);
        }
        if (source.FileVerifyDomains != null) {
            this.FileVerifyDomains = new String[source.FileVerifyDomains.length];
            for (int i = 0; i < source.FileVerifyDomains.length; i++) {
                this.FileVerifyDomains[i] = new String(source.FileVerifyDomains[i]);
            }
        }
        if (source.FileVerifyName != null) {
            this.FileVerifyName = new String(source.FileVerifyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileVerifyUrl", this.FileVerifyUrl);
        this.setParamArraySimple(map, prefix + "FileVerifyDomains.", this.FileVerifyDomains);
        this.setParamSimple(map, prefix + "FileVerifyName", this.FileVerifyName);

    }
}

