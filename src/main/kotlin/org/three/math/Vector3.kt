@file:JsQualifier("THREE")

package org.three.math

import org.three.cameras.Camera
import org.w3c.dom.DOMImplementation

open external class Vector3 {

    constructor()
    constructor(x: Double, y: Double, z: Double)

    var x: Double
    var y: Double
    var z: Double

    fun set(x: Double, y: Double, z: Double)
    fun setScalar(scalar: Double) : Vector3
    fun setX(x: Double) : Vector3
    fun setY(y: Double) : Vector3
    fun setZ(z: Double) : Vector3
    fun setComponent(index: Int, value: Double) : Vector3
    fun getComponent(index: Int): Double
    fun clone() : Vector3
    fun copy(v: Vector3) : Vector3
    fun add(v : Vector3) : Vector3
    fun addScalar(s: Double) : Vector3
    fun addVectors(a: Vector3, b: Vector3) : Vector3
    fun sub(v: Vector3) : Vector3
    fun subScalar(s: Double) : Vector3
    fun subVectors (a: Vector3, b: Vector3): Vector3
    fun multiply ( v: Vector3): Vector3
    fun multiplyScalar ( scalar: Double ): Vector3
    fun multiplyVectors (a: Vector3, b: Vector3): Vector3
    fun applyEuler (euler : Euler): Vector3
    fun applyAxisAngle (axis: Vector3, angle: Double): Vector3
    fun applyMatrix3 ( m: Matrix3): Vector3
    fun applyMatrix4 ( m: Matrix4): Vector3
    fun applyQuaternion ( q: Quaternion): Vector3
    fun project (camera: Camera): Vector3
    fun unproject (camera: Camera): Vector3
    fun transformDirection ( m: Matrix4): Vector3
    fun divide ( v: Vector3): Vector3
    fun divideScalar ( scalar:Double ): Vector3
    fun min ( v: Vector3): Vector3
    fun max ( v: Vector3): Vector3
    fun clamp (min : Vector3, max: Vector3) : Vector3
    fun clampScalar (minVal: Double, maxVal: Double): Vector3
    fun clampLength ( min: Double, max:Double ): Vector3
    fun floor (): Vector3
    fun ceil (): Vector3
    fun round (): Vector3
    fun roundToZero (): Vector3
    fun negate (): Vector3
    fun dot ( v: Vector3): Vector3
    fun lengthSq (): Double
    fun length (): Double
    fun manhattanLength (): Double
    fun normalize (): Vector3
    fun setLength ( length: Double ): Vector3
    fun lerp (v : Vector3, alpha: Double ) : Vector3
    fun lerpVectors (v1 : Vector3, v2 : Vector3, alpha: Double ): Vector3
    fun cross ( v: Vector3): Vector3
    fun crossVectors (a: Vector3, b: Vector3) : Vector3
    fun projectOnVector ( vector: Vector3): Vector3
    fun projectOnPlane (planeNormal: Vector3): Vector3
    fun reflect (normal: Vector3): Vector3
    fun angleTo ( v: Vector3): Double
    fun distanceTo ( v: Vector3):Double
    fun distanceToSquared ( v: Vector3): Double
    fun manhattanDistanceTo ( v: Vector3): Double
    fun setFromSpherical ( s: Spherical): Vector3
    fun setFromCylindrical ( c: Cylindrical): Vector3
    fun setFromMatrixPosition ( m: Matrix4): Vector3
    fun setFromMatrixScale ( m: Matrix4): Vector3
    fun setFromMatrixColumn (m: Matrix4, index: Int ) : Vector3
    fun equals ( v: Vector3): Boolean
    fun fromArray ( array : DoubleArray, offset: Int = definedExternally )
    fun toArray ( array:DoubleArray, offset:Int= definedExternally ) : DoubleArray
    fun fromBufferAttribute ( attribute:dynamic, index: Int, offset:Int= definedExternally )

}