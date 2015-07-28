/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2015 Wandora Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 
 */
package org.wandora.application.tools.extractors.rdf.rdfmappings;


public class EXIFMapping extends RDF2TopicMapsMapping {
    public static final String EXIF_NS = "http://www.w3.org/2003/12/exif/ns#";
    
    
    public static final String[] SI_BASENAME_MAPPING = new String[] {
        EXIF_NS+"exifdata",
         "exif:Exif data",
        EXIF_NS+"tag_number",
         "exif:Tag number",
        EXIF_NS+"tagid",
         "exif:Tag ID",
        EXIF_NS+"datatype",
         "exif:Data Type",
        EXIF_NS+"length",
         "exif:Length",
        EXIF_NS+"width",
         "exif:Width",
        EXIF_NS+"height",
         "exif:Height",
        EXIF_NS+"resolution",
         "exif:Resolution",
        EXIF_NS+"meter",
         "exif:Meter",
        EXIF_NS+"mm",
         "exif:Milimeter",
        EXIF_NS+"seconds",
         "exif:Seconds",
        EXIF_NS+"date",
         "exif:Date",
        EXIF_NS+"subseconds",
         "exif:Subseconds",
        EXIF_NS+"geo",
         "exif:Geometric data",
        EXIF_NS+"_unknown",
         "exif:Unknown tag",
        EXIF_NS+"exifAttribute",
         "exif:Exif Attribute",
        EXIF_NS+"dateAndOrTime",
         "exif:Date and/or Time",
        EXIF_NS+"gpsInfo",
         "exif:GPS Info",
        EXIF_NS+"ifdPointer",
         "exif:IFD Pointer",
        EXIF_NS+"imageConfig",
         "exif:Image Config",
        EXIF_NS+"imageDataCharacter",
         "exif:Image Data Character",
        EXIF_NS+"imageDataStruct",
         "exif:Image Data Structure",
        EXIF_NS+"interopInfo",
         "exif:Interoperability Info",
        EXIF_NS+"pictTaking",
         "exif:PictTaking",
        EXIF_NS+"pimInfo",
         "exif:PIM Info",
        EXIF_NS+"recOffset",
         "exif:Recording Offset",
        EXIF_NS+"relatedFile",
         "exif:Related File",
        EXIF_NS+"userInfo",
         "exif:User Info",
        EXIF_NS+"versionInfo",
         "exif:Version Info",
        EXIF_NS+"imageWidth",
         "exif:ImageWidth",
        EXIF_NS+"imageLength",
         "exif:ImageLength",
        EXIF_NS+"bitsPerSample",
         "exif:BitsPerSample",
        EXIF_NS+"compression",
         "exif:Compression",
        EXIF_NS+"photometricInterpretation",
         "exif:PhotometricInterpretation",
        EXIF_NS+"imageDescription",
         "exif:ImageDescription",
        EXIF_NS+"make",
         "exif:Make",
        EXIF_NS+"model",
         "exif:Model",
        EXIF_NS+"stripOffsets",
         "exif:StripOffsets",
        EXIF_NS+"orientation",
         "exif:Orientation",
        EXIF_NS+"samplesPerPixel",
         "exif:SamplesPerPixel",
        EXIF_NS+"rowsPerStrip",
         "exif:RowsPerStrip",
        EXIF_NS+"stripByteCounts",
         "exif:StripByteCounts",
        EXIF_NS+"xResolution",
         "exif:XResolution",
        EXIF_NS+"yResolution",
         "exif:YResolution",
        EXIF_NS+"planarConfiguration",
         "exif:PlanarConfiguration",
        EXIF_NS+"resolutionUnit",
         "exif:ResolutionUnit",
        EXIF_NS+"transferFunction",
         "exif:TransferFunction",
        EXIF_NS+"software",
         "exif:Software",
        EXIF_NS+"dateTime",
         "exif:DateTime",
        EXIF_NS+"artist",
         "exif:Artist",
        EXIF_NS+"whitePoint",
         "exif:WhitePoint",
        EXIF_NS+"primaryChromaticities",
         "exif:PrimaryChromaticities",
        EXIF_NS+"jpegInterchangeFormat",
         "exif:JPEGInterchangeFormat",
        EXIF_NS+"jpegInterchangeFormatLength",
         "exif:JPEGInterchangeFormatLength",
        EXIF_NS+"yCbCrCoefficients",
         "exif:YCbCrCoefficients",
        EXIF_NS+"yCbCrSubSampling",
         "exif:YCbCrSubSampling",
        EXIF_NS+"yCbCrPositioning",
         "exif:YCbCrPositioning",
        EXIF_NS+"referenceBlackWhite",
         "exif:ReferenceBlackWhite",
        EXIF_NS+"copyright",
         "exif:Copyright",
        EXIF_NS+"exif_IFD_Pointer",
         "exif:Exif IFD Pointer",
        EXIF_NS+"gpsInfo_IFD_Pointer",
         "exif:GPSInfo IFD Pointer",
        EXIF_NS+"exposureTime",
         "exif:ExposureTime",
        EXIF_NS+"fNumber",
         "exif:FNumber",
        EXIF_NS+"exposureProgram",
         "exif:ExposureProgram",
        EXIF_NS+"spectralSensitivity",
         "exif:SpectralSensitivity",
        EXIF_NS+"isoSpeedRatings",
         "exif:ISOSpeedRatings",
        EXIF_NS+"oecf",
         "exif:OECF",
        EXIF_NS+"exifVersion",
         "exif:ExifVersion",
        EXIF_NS+"dateTimeOriginal",
         "exif:DateTimeOriginal",
        EXIF_NS+"dateTimeDigitized",
         "exif:DateTimeDigitized",
        EXIF_NS+"componentsConfiguration",
         "exif:ComponentsConfiguration",
        EXIF_NS+"compressedBitsPerPixel",
         "exif:CompressedBitsPerPixel",
        EXIF_NS+"shutterSpeedValue",
         "exif:ShutterSpeedValue",
        EXIF_NS+"apertureValue",
         "exif:ApertureValue",
        EXIF_NS+"brightnessValue",
         "exif:BrightnessValue",
        EXIF_NS+"exposureBiasValue",
         "exif:ExposureBiasValue",
        EXIF_NS+"maxApertureValue",
         "exif:MaxApertureValue",
        EXIF_NS+"subjectDistance",
         "exif:SubjectDistance",
        EXIF_NS+"meteringMode",
         "exif:MeteringMode",
        EXIF_NS+"lightSource",
         "exif:LightSource",
        EXIF_NS+"flash",
         "exif:Flash",
        EXIF_NS+"focalLength",
         "exif:FocalLength",
        EXIF_NS+"subjectArea",
         "exif:SubjectArea",
        EXIF_NS+"makerNote",
         "exif:MakerNote",
        EXIF_NS+"userComment",
         "exif:UserComment",
        EXIF_NS+"subSecTime",
         "exif:SubSecTime",
        EXIF_NS+"subSecTimeOriginal",
         "exif:SubSecTimeOriginal",
        EXIF_NS+"subSecTimeDigitized",
         "exif:SubSecTimeDigitized",
        EXIF_NS+"flashpixVersion",
         "exif:FlashpixVersion",
        EXIF_NS+"colorSpace",
         "exif:ColorSpace",
        EXIF_NS+"pixelXDimension",
         "exif:PixelXDimension",
        EXIF_NS+"pixelYDimension",
         "exif:PixelYDimension",
        EXIF_NS+"relatedSoundFile",
         "exif:RelatedSoundFile",
        EXIF_NS+"interoperability_IFD_Pointer",
         "exif:Interoperability IFD Pointer",
        EXIF_NS+"flashEnergy",
         "exif:FlashEnergy",
        EXIF_NS+"spatialFrequencyResponse",
         "exif:SpatialFrequencyResponse",
        EXIF_NS+"focalPlaneXResolution",
         "exif:FocalPlaneXResolution",
        EXIF_NS+"focalPlaneYResolution",
         "exif:FocalPlaneYResolution",
        EXIF_NS+"focalPlaneResolutionUnit",
         "exif:FocalPlaneResolutionUnit",
        EXIF_NS+"subjectLocation",
         "exif:SubjectLocation",
        EXIF_NS+"exposureIndex",
         "exif:ExposureIndex",
        EXIF_NS+"sensingMethod",
         "exif:SensingMethod",
        EXIF_NS+"fileSource",
         "exif:FileSource",
        EXIF_NS+"sceneType",
         "exif:SceneType",
        EXIF_NS+"cfaPattern",
         "exif:CFAPattern",
        EXIF_NS+"customRendered",
         "exif:CustomRendered",
        EXIF_NS+"exposureMode",
         "exif:ExposureMode",
        EXIF_NS+"whiteBalance",
         "exif:WhiteBalance",
        EXIF_NS+"digitalZoomRatio",
         "exif:DigitalZoomRatio",
        EXIF_NS+"focalLengthIn35mmFilm",
         "exif:FocalLengthIn35mmFilm",
        EXIF_NS+"sceneCaptureType",
         "exif:SceneCaptureType",
        EXIF_NS+"gainControl",
         "exif:GainControl",
        EXIF_NS+"contrast",
         "exif:Contrast",
        EXIF_NS+"saturation",
         "exif:Saturation",
        EXIF_NS+"sharpness",
         "exif:Sharpness",
        EXIF_NS+"deviceSettingDescription",
         "exif:DeviceSettingDescription",
        EXIF_NS+"subjectDistanceRange",
         "exif:SubjectDistanceRange",
        EXIF_NS+"imageUniqueID",
         "exif:ImageUniqueID",
        EXIF_NS+"gpsVersionID",
         "exif:GPSVersionID",
        EXIF_NS+"gpsLatitudeRef",
         "exif:GPSLatitudeRef",
        EXIF_NS+"gpsLatitude",
         "exif:GPSLatitude",
        EXIF_NS+"gpsLongitudeRef",
         "exif:GPSLongitudeRef",
        EXIF_NS+"gpsLongitude",
         "exif:GPSLongitude",
        EXIF_NS+"gpsAltitudeRef",
         "exif:GPSAltitudeRef",
        EXIF_NS+"gpsAltitude",
         "exif:GPSAltitude",
        EXIF_NS+"gpsTimeStamp",
         "exif:GPSTimeStamp",
        EXIF_NS+"gpsSatellites",
         "exif:GPSSatellites",
        EXIF_NS+"gpsStatus",
         "exif:GPSStatus",
        EXIF_NS+"gpsMeasureMode",
         "exif:GPSMeasureMode",
        EXIF_NS+"gpsDOP",
         "exif:GPSDOP",
        EXIF_NS+"gpsSpeedRef",
         "exif:GPSSpeedRef",
        EXIF_NS+"gpsSpeed",
         "exif:GPSSpeed",
        EXIF_NS+"gpsTrackRef",
         "exif:GPSTrackRef",
        EXIF_NS+"gpsTrack",
         "exif:GPSTrack",
        EXIF_NS+"gpsImgDirectionRef",
         "exif:GPSImgDirectionRef",
        EXIF_NS+"gpsImgDirection",
         "exif:GPSImgDirection",
        EXIF_NS+"gpsMapDatum",
         "exif:GPSMapDatum",
        EXIF_NS+"gpsDestLatitudeRef",
         "exif:GPSDestLatitudeRef",
        EXIF_NS+"gpsDestLatitude",
         "exif:GPSDestLatitude",
        EXIF_NS+"gpsDestLongitudeRef",
         "exif:GPSDestLongitudeRef",
        EXIF_NS+"gpsDestLongitude",
         "exif:GPSDestLongitude",
        EXIF_NS+"gpsDestBearingRef",
         "exif:GPSDestBearingRef",
        EXIF_NS+"gpsDestBearing",
         "exif:GPSDestBearing",
        EXIF_NS+"gpsDestDistanceRef",
         "exif:GPSDestDistanceRef",
        EXIF_NS+"gpsDestDistance",
         "exif:GPSDestDistance",
        EXIF_NS+"gpsProcessingMethod",
         "exif:GPSProcessingMethod",
        EXIF_NS+"gpsAreaInformation",
         "exif:GPSAreaInformation",
        EXIF_NS+"gpsDateStamp",
         "exif:GPSDateStamp",
        EXIF_NS+"gpsDifferential",
         "exif:GPSDifferential",
        EXIF_NS+"interoperabilityIndex",
         "exif:InteroperabilityIndex",
        EXIF_NS+"interoperabilityVersion",
         "exif:InteroperabilityVersion",
        EXIF_NS+"relatedImageFileFormat",
         "exif:RelatedImageFileFormat",
        EXIF_NS+"relatedImageWidth",
         "exif:RelatedImageWidth",
        EXIF_NS+"relatedImageLength",
         "exif:RelatedImageLength",
        EXIF_NS+"printImageMatching_IFD_Pointer",
         "exif:PrintImageMatching IFD Pointer",
        EXIF_NS+"pimContrast",
         "exif:PrintIM Contrast",
        EXIF_NS+"pimBrightness",
         "exif:PrintIM Brightness",
        EXIF_NS+"pimColorBalance",
         "exif:PrintIM ColorBalance",
        EXIF_NS+"pimSaturation",
         "exif:PrintIM Saturation",
        EXIF_NS+"pimSharpness",
         "exif:PrintIM Sharpness",
    };
    
    
    
    public static final String[] ASSOCIATION_TYPE_TO_ROLES_MAPPING = new String[] {
    };
    
    
    
    public String[] getRoleMappings() {
        return ASSOCIATION_TYPE_TO_ROLES_MAPPING;
    }
    public String[] getBasenameMappings() {
        return SI_BASENAME_MAPPING;
    }    
    
    
}