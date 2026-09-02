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

public class ImageScanAssetTarget extends AbstractModel {

    /**
    * <p>Target image match mode</p><p>Enumeration values:</p><ul><li>ALL: all images</li><li>MANUAL: select</li><li>AUTO_MATCH: auto-match</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Image id excluded from scan in mirror mode for all</p>
    */
    @SerializedName("ExcludeImages")
    @Expose
    private String [] ExcludeImages;

    /**
    * <p>id of the mirror that needs to be scanned in manual selection mode</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>Matching configuration in auto-match mode</p>
    */
    @SerializedName("AutoMatch")
    @Expose
    private ImageScanAutoMatchConfig AutoMatch;

    /**
     * Get <p>Target image match mode</p><p>Enumeration values:</p><ul><li>ALL: all images</li><li>MANUAL: select</li><li>AUTO_MATCH: auto-match</li></ul> 
     * @return Mode <p>Target image match mode</p><p>Enumeration values:</p><ul><li>ALL: all images</li><li>MANUAL: select</li><li>AUTO_MATCH: auto-match</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Target image match mode</p><p>Enumeration values:</p><ul><li>ALL: all images</li><li>MANUAL: select</li><li>AUTO_MATCH: auto-match</li></ul>
     * @param Mode <p>Target image match mode</p><p>Enumeration values:</p><ul><li>ALL: all images</li><li>MANUAL: select</li><li>AUTO_MATCH: auto-match</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Image id excluded from scan in mirror mode for all</p> 
     * @return ExcludeImages <p>Image id excluded from scan in mirror mode for all</p>
     */
    public String [] getExcludeImages() {
        return this.ExcludeImages;
    }

    /**
     * Set <p>Image id excluded from scan in mirror mode for all</p>
     * @param ExcludeImages <p>Image id excluded from scan in mirror mode for all</p>
     */
    public void setExcludeImages(String [] ExcludeImages) {
        this.ExcludeImages = ExcludeImages;
    }

    /**
     * Get <p>id of the mirror that needs to be scanned in manual selection mode</p> 
     * @return Images <p>id of the mirror that needs to be scanned in manual selection mode</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>id of the mirror that needs to be scanned in manual selection mode</p>
     * @param Images <p>id of the mirror that needs to be scanned in manual selection mode</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Matching configuration in auto-match mode</p> 
     * @return AutoMatch <p>Matching configuration in auto-match mode</p>
     */
    public ImageScanAutoMatchConfig getAutoMatch() {
        return this.AutoMatch;
    }

    /**
     * Set <p>Matching configuration in auto-match mode</p>
     * @param AutoMatch <p>Matching configuration in auto-match mode</p>
     */
    public void setAutoMatch(ImageScanAutoMatchConfig AutoMatch) {
        this.AutoMatch = AutoMatch;
    }

    public ImageScanAssetTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanAssetTarget(ImageScanAssetTarget source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ExcludeImages != null) {
            this.ExcludeImages = new String[source.ExcludeImages.length];
            for (int i = 0; i < source.ExcludeImages.length; i++) {
                this.ExcludeImages[i] = new String(source.ExcludeImages[i]);
            }
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.AutoMatch != null) {
            this.AutoMatch = new ImageScanAutoMatchConfig(source.AutoMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "ExcludeImages.", this.ExcludeImages);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamObj(map, prefix + "AutoMatch.", this.AutoMatch);

    }
}

