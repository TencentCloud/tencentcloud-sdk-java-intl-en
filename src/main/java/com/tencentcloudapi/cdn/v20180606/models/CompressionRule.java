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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompressionRule extends AbstractModel{

    /**
    * true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compress")
    @Expose
    private Boolean Compress;

    /**
    * The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * File compression algorithm
gzip: specifies Gzip compression
brotli: specifies Brotli compression
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Algorithms")
    @Expose
    private String [] Algorithms;

    /**
    * Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`contentType`: effective when the `ContentType` is specified
If this field is specified, `FileExtensions` does not take effect.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `contentType`, enter `text/html`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Compress true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCompress() {
        return this.Compress;
    }

    /**
     * Set true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Compress true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompress(Boolean Compress) {
        this.Compress = Compress;
    }

    /**
     * Get The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MinLength The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MinLength The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxLength The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxLength The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get File compression algorithm
gzip: specifies Gzip compression
brotli: specifies Brotli compression
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Algorithms File compression algorithm
gzip: specifies Gzip compression
brotli: specifies Brotli compression
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAlgorithms() {
        return this.Algorithms;
    }

    /**
     * Set File compression algorithm
gzip: specifies Gzip compression
brotli: specifies Brotli compression
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Algorithms File compression algorithm
gzip: specifies Gzip compression
brotli: specifies Brotli compression
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAlgorithms(String [] Algorithms) {
        this.Algorithms = Algorithms;
    }

    /**
     * Get Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileExtensions Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileExtensions Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`contentType`: effective when the `ContentType` is specified
If this field is specified, `FileExtensions` does not take effect.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RuleType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`contentType`: effective when the `ContentType` is specified
If this field is specified, `FileExtensions` does not take effect.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`contentType`: effective when the `ContentType` is specified
If this field is specified, `FileExtensions` does not take effect.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RuleType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`contentType`: effective when the `ContentType` is specified
If this field is specified, `FileExtensions` does not take effect.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `contentType`, enter `text/html`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RulePaths Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `contentType`, enter `text/html`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `contentType`, enter `text/html`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RulePaths Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `contentType`, enter `text/html`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public CompressionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompressionRule(CompressionRule source) {
        if (source.Compress != null) {
            this.Compress = new Boolean(source.Compress);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.Algorithms != null) {
            this.Algorithms = new String[source.Algorithms.length];
            for (int i = 0; i < source.Algorithms.length; i++) {
                this.Algorithms[i] = new String(source.Algorithms[i]);
            }
        }
        if (source.FileExtensions != null) {
            this.FileExtensions = new String[source.FileExtensions.length];
            for (int i = 0; i < source.FileExtensions.length; i++) {
                this.FileExtensions[i] = new String(source.FileExtensions[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamArraySimple(map, prefix + "Algorithms.", this.Algorithms);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

