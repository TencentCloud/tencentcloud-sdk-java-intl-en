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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConditionMatch extends AbstractModel {

    /**
    * <p>Image ID match string (select one of the three, one and only one can be non-empty)</p>
    */
    @SerializedName("ImageIDMatchString")
    @Expose
    private String ImageIDMatchString;

    /**
    * <p>Image name match string (choose one of three, one and only one is non-empty)</p>
    */
    @SerializedName("ImageNameMatchString")
    @Expose
    private String ImageNameMatchString;

    /**
    * <p>Image address match string (Select one of the three. One and only one is non-empty)</p>
    */
    @SerializedName("ImageAddressMatchString")
    @Expose
    private String ImageAddressMatchString;

    /**
    * <p>Match condition. Value: EQUALS-equal to/NOT_EQUALS-not equal to/STARTS_WITH-starting with/NOT_STARTS_WITH-not starting with/ENDS_WITH-ending with/NOT_ENDS_WITH-not ending with/CONTAINS-containing/NOT_CONTAINS-excluding</p>
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
     * Get <p>Image ID match string (select one of the three, one and only one can be non-empty)</p> 
     * @return ImageIDMatchString <p>Image ID match string (select one of the three, one and only one can be non-empty)</p>
     */
    public String getImageIDMatchString() {
        return this.ImageIDMatchString;
    }

    /**
     * Set <p>Image ID match string (select one of the three, one and only one can be non-empty)</p>
     * @param ImageIDMatchString <p>Image ID match string (select one of the three, one and only one can be non-empty)</p>
     */
    public void setImageIDMatchString(String ImageIDMatchString) {
        this.ImageIDMatchString = ImageIDMatchString;
    }

    /**
     * Get <p>Image name match string (choose one of three, one and only one is non-empty)</p> 
     * @return ImageNameMatchString <p>Image name match string (choose one of three, one and only one is non-empty)</p>
     */
    public String getImageNameMatchString() {
        return this.ImageNameMatchString;
    }

    /**
     * Set <p>Image name match string (choose one of three, one and only one is non-empty)</p>
     * @param ImageNameMatchString <p>Image name match string (choose one of three, one and only one is non-empty)</p>
     */
    public void setImageNameMatchString(String ImageNameMatchString) {
        this.ImageNameMatchString = ImageNameMatchString;
    }

    /**
     * Get <p>Image address match string (Select one of the three. One and only one is non-empty)</p> 
     * @return ImageAddressMatchString <p>Image address match string (Select one of the three. One and only one is non-empty)</p>
     */
    public String getImageAddressMatchString() {
        return this.ImageAddressMatchString;
    }

    /**
     * Set <p>Image address match string (Select one of the three. One and only one is non-empty)</p>
     * @param ImageAddressMatchString <p>Image address match string (Select one of the three. One and only one is non-empty)</p>
     */
    public void setImageAddressMatchString(String ImageAddressMatchString) {
        this.ImageAddressMatchString = ImageAddressMatchString;
    }

    /**
     * Get <p>Match condition. Value: EQUALS-equal to/NOT_EQUALS-not equal to/STARTS_WITH-starting with/NOT_STARTS_WITH-not starting with/ENDS_WITH-ending with/NOT_ENDS_WITH-not ending with/CONTAINS-containing/NOT_CONTAINS-excluding</p> 
     * @return MatchType <p>Match condition. Value: EQUALS-equal to/NOT_EQUALS-not equal to/STARTS_WITH-starting with/NOT_STARTS_WITH-not starting with/ENDS_WITH-ending with/NOT_ENDS_WITH-not ending with/CONTAINS-containing/NOT_CONTAINS-excluding</p>
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>Match condition. Value: EQUALS-equal to/NOT_EQUALS-not equal to/STARTS_WITH-starting with/NOT_STARTS_WITH-not starting with/ENDS_WITH-ending with/NOT_ENDS_WITH-not ending with/CONTAINS-containing/NOT_CONTAINS-excluding</p>
     * @param MatchType <p>Match condition. Value: EQUALS-equal to/NOT_EQUALS-not equal to/STARTS_WITH-starting with/NOT_STARTS_WITH-not starting with/ENDS_WITH-ending with/NOT_ENDS_WITH-not ending with/CONTAINS-containing/NOT_CONTAINS-excluding</p>
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    public ConditionMatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConditionMatch(ConditionMatch source) {
        if (source.ImageIDMatchString != null) {
            this.ImageIDMatchString = new String(source.ImageIDMatchString);
        }
        if (source.ImageNameMatchString != null) {
            this.ImageNameMatchString = new String(source.ImageNameMatchString);
        }
        if (source.ImageAddressMatchString != null) {
            this.ImageAddressMatchString = new String(source.ImageAddressMatchString);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageIDMatchString", this.ImageIDMatchString);
        this.setParamSimple(map, prefix + "ImageNameMatchString", this.ImageNameMatchString);
        this.setParamSimple(map, prefix + "ImageAddressMatchString", this.ImageAddressMatchString);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);

    }
}

