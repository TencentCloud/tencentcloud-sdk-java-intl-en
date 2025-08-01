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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileAttributesTaskOutput extends AbstractModel {

    /**
    * The MD5 hash of the file.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * The Sha1 value of the media file.
    */
    @SerializedName("Sha1")
    @Expose
    private String Sha1;

    /**
     * Get The MD5 hash of the file. 
     * @return Md5 The MD5 hash of the file.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set The MD5 hash of the file.
     * @param Md5 The MD5 hash of the file.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get The Sha1 value of the media file. 
     * @return Sha1 The Sha1 value of the media file.
     */
    public String getSha1() {
        return this.Sha1;
    }

    /**
     * Set The Sha1 value of the media file.
     * @param Sha1 The Sha1 value of the media file.
     */
    public void setSha1(String Sha1) {
        this.Sha1 = Sha1;
    }

    public DescribeFileAttributesTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileAttributesTaskOutput(DescribeFileAttributesTaskOutput source) {
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Sha1 != null) {
            this.Sha1 = new String(source.Sha1);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Sha1", this.Sha1);

    }
}

